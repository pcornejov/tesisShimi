import { Component, OnInit } from '@angular/core';
import { RestService } from '../../services/rest/rest.service';
import { Router } from '@angular/router';
import { rutYPerfil } from '../../classes/rutyperfil';
import { HttpResponse } from '@angular/common/http';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';
import { tap } from 'rxjs/operators/tap';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-perfil',
    templateUrl: 'perfil.component.html',
    styleUrls: ['perfil.component.css'],
})
export class PerfilComponent implements OnInit {
    private anioEgreso: string;
    ngOnInit(): void {
        this.anioEgreso = '-1';
    }
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) { }

    private continuar() {
        this.agregaPerfil().subscribe((response: HttpResponse<any>) => {
        });
    }
    public agregaPerfil() {
        const api = '/tesis/agregaPerfil';
        let rutPerfil = this.servicioRut.getRutPerfil();
        let ryp = new rutYPerfil();
        ryp.perfil = this.anioEgreso;
        ryp.id = rutPerfil.id;
        return this.rest.post(api, ryp).pipe(
            tap((response: HttpResponse<any>) => {
                if (response.status !== 200 && response.status !== 204) {
                    throw new Error(response.status.toString());
                } else {
                    if (response.status === 200) {

                        this.router.navigate(['landing']);
                    }
                }
            })
        );
    }
}
