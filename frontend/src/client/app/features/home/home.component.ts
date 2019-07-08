import { Component } from '@angular/core';
import { RestService } from '../../services/rest/rest.service';
import { Observable } from 'rxjs/Observable';
import { tap } from 'rxjs/operators/tap';
import { HttpResponse } from '@angular/common/http';
import { Route, Router } from '@angular/router';
import { rutYPerfil } from '../../classes/rutyperfil';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';

/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-home',
    templateUrl: 'home.component.html',
    styleUrls: ['home.component.css'],
})
export class HomeComponent {
    /* CONSTRUCTOR */
    private rut: string;
    private rutValido: boolean;
    private anioEgreso: string;
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) {

        this.rutValido = false;
    }

    public ingresar() {
        this.retornoIngresar().subscribe((response: HttpResponse<any>) => {

        })
    }
    public retornoIngresar(): Observable<HttpResponse<any>> {
        const api = '/tesis/verificaRut';
        let ryp = new rutYPerfil();
        ryp.rut = this.rut;
        return this.rest.post(api, ryp).pipe(
            tap((response: HttpResponse<any>) => {
                if (response.status !== 200 && response.status !== 204) {
                    throw new Error(response.status.toString());
                } else {
                    if(response.body.id !== '0') {
                        let rutPerfil = new rutYPerfil();
                        rutPerfil.id = response.body.id;
                        rutPerfil.rut = response.body.rut;
                        this.servicioRut.seteaRutPerfil(rutPerfil);
                        this.router.navigate(['perfil']);
                        
                    } else {
                        let rutPerfil = new rutYPerfil();
                        rutPerfil.rut = response.body.rut;
                        this.servicioRut.seteaRutPerfil(rutPerfil);
                        this.router.navigate(['bienvenida']);
                    }
                }
            })
        );
    }
}
