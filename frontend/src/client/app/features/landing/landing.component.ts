import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';
import { Observable } from 'rxjs/Observable';
import { HttpResponse } from '@angular/common/http';
import { RestService } from '../../services/rest/rest.service';
import { tap } from 'rxjs/operators/tap';
import { Prueba1 } from '../../classes/prueba1';
import { Prueba3 } from '../../classes/prueba3';
import { Prueba4 } from '../../classes/prueba4';
import { Prueba5 } from '../../classes/prueba5';
import { Prueba2 } from '../../classes/prueba2';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-landing',
    templateUrl: 'landing.component.html',
    styleUrls: ['landing.component.css'],
})
export class LandingComponent implements OnInit {
    private existePrueba1: boolean = false;
    private existePrueba2: boolean = false;
    private existePrueba3: boolean = false;
    private existePrueba4: boolean = false;
    private existePrueba5: boolean = false;
    private prueba1Bd: Prueba1;
    private prueba2Bd: Prueba2;
    private prueba3Bd: Prueba3;
    private prueba4Bd: Prueba4;
    private prueba5Bd: Prueba5;
    private rutaImagen: string = '';

    ngOnInit(): void {
        //verificar si tengo pruebas
        this.prueba1Bd = new Prueba1();
        this.prueba2Bd = new Prueba2();
        this.prueba3Bd = new Prueba3();
        this.prueba4Bd = new Prueba4();
        this.prueba5Bd = new Prueba5();
        this.verificaPruebas().subscribe((response: HttpResponse<any>) => {
        })
    }
    constructor(private router: Router, private rest: RestService, private servicioRut: ServicioRutService) { }

    private prueba1() {
        this.router.navigate(['prueba1']);
        this.existePrueba1 = true;
    }
    private prueba2() {
        this.router.navigate(['prueba2']);
        this.existePrueba2 = true;
    }
    private prueba3() {
        this.router.navigate(['prueba3']);
        this.existePrueba3 = true;
    }
    private prueba4() {
        this.router.navigate(['prueba4']);
        this.existePrueba4 = true;
    }
    private prueba5() {
        this.router.navigate(['prueba5']);
        this.existePrueba5 = true;
    }

    private verificaPruebas(): Observable<HttpResponse<any>> {
        this.prueba1Bd = new Prueba1();
        this.prueba1Bd.buenas = 0;
        this.prueba1Bd.tiempo = 0;
        this.prueba2Bd = new Prueba2();
        this.prueba2Bd.buenas = 0;
        this.prueba2Bd.tiempo = 0;
        this.prueba3Bd = new Prueba3();
        this.prueba3Bd.buenas = 0;
        this.prueba3Bd.tiempo = 0;
        this.prueba4Bd = new Prueba4();
        this.prueba4Bd.buenas = 0;
        this.prueba4Bd.tiempo = 0;
        this.prueba5Bd = new Prueba5();
        this.prueba5Bd.buenas = 0;
        this.prueba5Bd.tiempo = 0;
        const api = '/tesis/buscaPruebas';
        let buenas = 0;
        let rutPerfil = this.servicioRut.getRutPerfil();
        return this.rest.post(api, rutPerfil).pipe(
            tap((response: HttpResponse<any>) => {
                if (response.status !== 200 && response.status !== 204) {
                    throw new Error(response.status.toString());
                } else {
                    if (response.status === 200) {
                        if (response.body.prueba1) {
                            this.prueba1Bd = response.body.prueba1;
                            this.existePrueba1 = true;
                        }
                        if (response.body.prueba2) {
                            this.prueba2Bd = response.body.prueba2;
                            this.existePrueba2 = true;
                        }
                        if (response.body.prueba3) {
                            this.prueba3Bd = response.body.prueba3;
                            this.existePrueba3 = true;
                        }
                        if (response.body.prueba4) {
                            this.prueba4Bd = response.body.prueba4;
                            this.existePrueba4 = true;
                        }
                        if (response.body.prueba5) {
                            this.prueba5Bd = response.body.prueba5;
                            this.existePrueba5 = true;
                        }
                        buenas += this.prueba1Bd.buenas;
                        buenas += this.prueba2Bd.buenas;
                        buenas += this.prueba3Bd.buenas;
                        buenas += this.prueba4Bd.buenas;
                        buenas += this.prueba5Bd.buenas;
                        let porcentaje = (buenas / 346) * 100;
                        if (porcentaje > 0 && porcentaje <= 25) {
                            this.rutaImagen = 'assets/img/reloj1.png';
                        } else {
                            if (porcentaje > 25 && porcentaje <= 50) {
                                this.rutaImagen = 'assets/img/reloj2.png';
                            } else {
                                if (porcentaje > 50 && porcentaje <= 75) {
                                    this.rutaImagen = 'assets/img/reloj3.png';
                                } else {
                                    if (porcentaje > 75) {
                                        this.rutaImagen = 'assets/img/reloj4.png';
                                    }
                                }
                            }
                        }
                    }
                }
            }));
    }
}


