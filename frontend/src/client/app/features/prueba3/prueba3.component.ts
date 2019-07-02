import { Component } from '@angular/core';
import { Prueba3 } from '../../classes/prueba3';
import { RestService } from '../../services/rest/rest.service';
import { Router } from '@angular/router';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';
import { HttpResponse } from '@angular/common/http';
import { tap } from 'rxjs/operators/tap';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-prueba3',
    templateUrl: 'prueba3.component.html',
    styleUrls: ['prueba3.component.css'],
})
export class Prueba3Component {
    private pregunta1: string;
    private pregunta2: string;
    private pregunta3: string;
    private pregunta4: string;
    private pregunta5: string;
    private pregunta6: string;
    private pregunta7: string;
    private pregunta8: string;
    private pregunta9: string;
    private pregunta10: string;
    private pregunta11: string;
    private pregunta12: string;
    private pregunta13: string;
    private pregunta14: string;
    private pregunta15: string;
    private vyf1: string;
    private vyf2: string;
    private vyf3: string;
    private vyf4: string;
    private vyf5: string;
    private vyf6: string;
    private vyf7: string;
    private vyf8: string;
    private vyf9: string;
    private vyf10: string;
    private vyf11: string;
    private prueba3: Prueba3;
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) {
        this.prueba3 = new Prueba3();
        this.pregunta1 = '';
        this.pregunta2 = '';
        this.pregunta3 = '';
        this.pregunta4 = '';
        this.pregunta5 = '';
        this.pregunta6 = '';
        this.pregunta7 = '';
        this.pregunta8 = '';
        this.pregunta9 = '';
        this.pregunta10 = '';
        this.pregunta11 = '';
        this.pregunta12 = '';
        this.pregunta13 = '';
        this.pregunta14 = '';
        this.pregunta15 = '';
        this.vyf1 = '';
        this.vyf2 = '';
        this.vyf3 = '';
        this.vyf4 = '';
        this.vyf5 = '';
        this.vyf6 = '';
        this.vyf7 = '';
        this.vyf8 = '';
        this.vyf9 = '';
        this.vyf10 = '';
        this.vyf11 = '';
    }

    public finalizar() {
        this.prueba3.pregunta1 = this.pregunta1;
        this.prueba3.pregunta2 = this.pregunta2;
        this.prueba3.pregunta3 = this.pregunta3;
        this.prueba3.pregunta4 = this.pregunta4;
        this.prueba3.pregunta5 = this.pregunta5;
        this.prueba3.pregunta6 = this.pregunta6;
        this.prueba3.pregunta7 = this.pregunta7;
        this.prueba3.pregunta8 = this.pregunta8;
        this.prueba3.pregunta9 = this.pregunta9;
        this.prueba3.pregunta10 = this.pregunta10;
        this.prueba3.pregunta11 = this.pregunta11;
        this.prueba3.pregunta12 = this.pregunta12;
        this.prueba3.pregunta13 = this.pregunta13;
        this.prueba3.pregunta14 = this.pregunta14;
        this.prueba3.pregunta15 = this.pregunta15;
        this.prueba3.vyf1 = this.vyf1;
        this.prueba3.vyf2 = this.vyf2;
        this.prueba3.vyf3 = this.vyf3;
        this.prueba3.vyf4 = this.vyf4;
        this.prueba3.vyf5 = this.vyf5;
        this.prueba3.vyf6 = this.vyf6;
        this.prueba3.vyf7 = this.vyf7;
        this.prueba3.vyf8 = this.vyf8;
        this.prueba3.vyf9 = this.vyf9;
        this.prueba3.vyf10 = this.vyf10;
        this.prueba3.vyf11 = this.vyf11;
        this.prueba3.rut = this.servicioRut.getRutPerfil().rut;
        this.agregaPrueba().subscribe((response: HttpResponse<any>) => {
        });
        this.router.navigate(['landing']);
    }

    public agregaPrueba() {
        const api = '/tesis/insertaPrueba3';
        return this.rest.post(api, this.prueba3).pipe(
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
