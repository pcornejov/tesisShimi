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
    private mensajeError: string;
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) {

        this.rutValido = false;
    }

    public ingresar() {
        this.rutValido = true;
        if(!this.rut.includes('-')) {
            this.mensajeError = 'El rut ingresado es invalido'
            return;
        }
        const cuerpo = this.rut.substring(0, this.rut.indexOf('-'));
        const dv = this.rut.substring(this.rut.indexOf('-')+1, this.rut.length);
        // Calcular Dígito Verificador
        let suma = 0;
        let multiplo = 2;
        // Para cada dígito del Cuerpo
        for (let i = 1; i <= cuerpo.length; i++) {
            // Obtener su Producto con el Múltiplo Correspondiente
            const index = multiplo * +cuerpo.charAt(cuerpo.length - i);
            // Sumar al Contador General
            suma += index;
            // Consolidar Múltiplo dentro del rango [2,7]
            if (multiplo < 7) {
                multiplo += 1;
            } else {
                multiplo = 2;
            }
        }
        // Calcular Dígito Verificador en base al Módulo 11
        let dvEsperado: any = 11 - (suma % 11);
        if (dvEsperado === 10) {
            dvEsperado = 'k';
        }
        if (dvEsperado === 11) {
            dvEsperado = 0;
        }
        if (String(dvEsperado) === dv.toLowerCase()) {
            this.retornoIngresar().subscribe((response: HttpResponse<any>) => {
            })
        } else {
            this.mensajeError = 'El rut ingresado es invalido'
            return;
        }
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
