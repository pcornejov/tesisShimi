import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Prueba1 } from '../../classes/prueba1';
import { HttpResponse } from '@angular/common/http';
import { tap } from 'rxjs/operators/tap';
import { RestService } from '../../services/rest/rest.service';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-prueba1',
    templateUrl: 'prueba1.component.html',
    styleUrls: ['prueba1.component.css'],
})
export class Prueba1Component {
    private pregunta1: string;
    private pregunta2: string;
    private pregunta3: string;
    private pregunta4: string;
    private pregunta5: string;
    private pregunta6: string;
    private pregunta9: string;
    private pregunta10: string;
    private pregunta11: string;
    private pregunta12: string;
    private pregunta14: string;
    private pregunta15: string;
    private pregunta16: string;
    private pregunta17: string;
    private pregunta19: string;
    private clasificacion1: string;
    private clasificacion2: string;
    private clasificacion3: string;
    private clasificacion4: string;
    private clasificacion5: string;
    private clasificacion6: string;
    private clasificacion7: string;
    private clasificacion8: string;
    private concepto1: string;
    private concepto2: string;
    private concepto3: string;
    private concepto4: string;
    private concepto5: string;
    private concepto6: string;
    private concepto7: string;
    private concepto8: string;
    private concepto9: string;
    private concepto10: string;
    private concepto11: string;
    private riesgo1: string;
    private riesgo2: string;
    private riesgo3: string;
    private riesgo4: string;
    private riesgo5: string;
    private riesgo6: string;
    private riesgo7: string;
    private riesgo8: string;
    private vyf1: string;
    private vyf2: string;
    private vyf3: string;
    private vyf4: string;
    private finanzasSelect1: string;
    private finanzasSelect2: string;
    private finanzasSelect3: string;
    private finanzasSelect4: string;
    private finanzasSelect5: string;
    private finanzasSelect6: string;
    private finanzasPregunta2: string;
    private finanzasPregunta3: string;
    private finanzasPregunta4: string;
    private finanzasPregunta5: string;
    private finanzasPregunta6: string;
    private finanzasPregunta7: string;
    private finanzasPregunta8: string;
    private finanzasPregunta9: string;
    private finanzasPregunta10: string;
    private finanzasPregunta11: string;
    private finanzasPregunta12: string;
    private finanzasPregunta13: string;
    private finanzasPregunta14: string;

    private prueba: Prueba1;
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) {
        this.prueba = new Prueba1();
        this.pregunta1 = '';
        this.pregunta2 = '';
        this.pregunta3 = '';
        this.pregunta4 = '';
        this.pregunta5 = '';
        this.pregunta6 = '';
        this.pregunta9 = '';
        this.pregunta10 = '';
        this.pregunta11 = '';
        this.pregunta12 = '';
        this.pregunta14 = '';
        this.pregunta15 = '';
        this.pregunta16 = '';
        this.pregunta17 = '';
        this.pregunta19 = '';
        this.clasificacion1 = '-1';
        this.clasificacion2 = '-1';
        this.clasificacion3 = '-1';
        this.clasificacion4 = '-1';
        this.clasificacion5 = '-1';
        this.clasificacion6 = '-1';
        this.clasificacion7 = '-1';
        this.clasificacion8 = '-1';
        this.concepto1 = '-1';
        this.concepto2 = '-1';
        this.concepto3 = '-1';
        this.concepto4 = '-1';
        this.concepto5 = '-1';
        this.concepto6 = '-1';
        this.concepto7 = '-1';
        this.concepto8 = '-1';
        this.concepto9 = '-1';
        this.concepto10 = '-1';
        this.concepto11 = '-1';
        this.riesgo1 = '-1';
        this.riesgo2 = '-1';
        this.riesgo3 = '-1';
        this.riesgo4 = '-1';
        this.riesgo5 = '-1';
        this.riesgo6 = '-1';
        this.riesgo7 = '-1';
        this.riesgo8 = '-1';
        this.vyf1 = '';
        this.vyf2 = '';
        this.vyf3 = '';
        this.vyf4 = '';
        this.finanzasSelect1 = '-1';
        this.finanzasSelect2 = '-1';
        this.finanzasSelect3 = '-1';
        this.finanzasSelect4 = '-1';
        this.finanzasSelect5 = '-1';
        this.finanzasSelect6 = '-1';
        this.finanzasPregunta2 = '';
        this.finanzasPregunta3 = '';
        this.finanzasPregunta4 = '';
        this.finanzasPregunta5 = '';
        this.finanzasPregunta6 = '';
        this.finanzasPregunta7 = '';
        this.finanzasPregunta8 = '';
        this.finanzasPregunta9 = '';
        this.finanzasPregunta10 = '';
        this.finanzasPregunta11 = '';
        this.finanzasPregunta12 = '';
        this.finanzasPregunta13 = '';
        this.finanzasPregunta14 = '';
    }
    public finalizar() {
        this.prueba.pregunta1 = this.pregunta1;
        this.prueba.pregunta2 = this.pregunta2;
        this.prueba.pregunta3 = this.pregunta3;
        this.prueba.pregunta4 = this.pregunta4;
        this.prueba.pregunta5 = this.pregunta5;
        this.prueba.pregunta6 = this.pregunta6;
        this.prueba.pregunta9 = this.pregunta9;
        this.prueba.pregunta10 = this.pregunta10;
        this.prueba.pregunta11 = this.pregunta11;
        this.prueba.pregunta12 = this.pregunta12;
        this.prueba.pregunta14 = this.pregunta14;
        this.prueba.pregunta15 = this.pregunta15;
        this.prueba.pregunta16 = this.pregunta16;
        this.prueba.pregunta17 = this.pregunta17;
        this.prueba.pregunta19 = this.pregunta19
        this.prueba.clasificacion1 = this.clasificacion1;
        this.prueba.clasificacion2 = this.clasificacion2;
        this.prueba.clasificacion3 = this.clasificacion3;
        this.prueba.clasificacion4 = this.clasificacion4;
        this.prueba.clasificacion5 = this.clasificacion5;
        this.prueba.clasificacion6 = this.clasificacion6;
        this.prueba.clasificacion7 = this.clasificacion7;
        this.prueba.clasificacion8 = this.clasificacion8;
        this.prueba.concepto1 = this.concepto1;
        this.prueba.concepto2 = this.concepto2;
        this.prueba.concepto3 = this.concepto3;
        this.prueba.concepto4 = this.concepto4;
        this.prueba.concepto5 = this.concepto5;
        this.prueba.concepto6 = this.concepto6;
        this.prueba.concepto7 = this.concepto7;
        this.prueba.concepto8 = this.concepto8;
        this.prueba.concepto9 = this.concepto9;
        this.prueba.concepto10 = this.concepto10;
        this.prueba.concepto11 = this.concepto11;
        this.prueba.riesgo1 = this.riesgo1;
        this.prueba.riesgo2 = this.riesgo2;
        this.prueba.riesgo3 = this.riesgo3;
        this.prueba.riesgo4 = this.riesgo4;
        this.prueba.riesgo5 = this.riesgo5;
        this.prueba.riesgo6 = this.riesgo6;
        this.prueba.riesgo7 = this.riesgo7;
        this.prueba.riesgo8 = this.riesgo8;
        this.prueba.vyf1 = this.vyf1;
        this.prueba.vyf2 = this.vyf2;
        this.prueba.vyf3 = this.vyf3;
        this.prueba.vyf4 = this.vyf4;
        this.prueba.finanzasSelect1 = this.finanzasSelect1;
        this.prueba.finanzasSelect2 = this.finanzasSelect2;
        this.prueba.finanzasSelect3 = this.finanzasSelect3;
        this.prueba.finanzasSelect4 = this.finanzasSelect4;
        this.prueba.finanzasSelect5 = this.finanzasSelect5;
        this.prueba.finanzasSelect6 = this.finanzasSelect6;
        this.prueba.finanzasPregunta2 = this.finanzasPregunta2;
        this.prueba.finanzasPregunta3 = this.finanzasPregunta3;
        this.prueba.finanzasPregunta4 = this.finanzasPregunta4;
        this.prueba.finanzasPregunta5 = this.finanzasPregunta5;
        this.prueba.finanzasPregunta6 = this.finanzasPregunta6;
        this.prueba.finanzasPregunta7 = this.finanzasPregunta7;
        this.prueba.finanzasPregunta8 = this.finanzasPregunta8;
        this.prueba.finanzasPregunta9 = this.finanzasPregunta9;
        this.prueba.finanzasPregunta10 = this.finanzasPregunta10;
        this.prueba.finanzasPregunta11 = this.finanzasPregunta11;
        this.prueba.finanzasPregunta12 = this.finanzasPregunta12;
        this.prueba.finanzasPregunta13 = this.finanzasPregunta13;
        this.prueba.finanzasPregunta14 = this.finanzasPregunta14;
        this.prueba.rut = this.servicioRut.getRutPerfil().rut;
        this.agregaPrueba().subscribe((response: HttpResponse<any>) => {
        });
        this.router.navigate(['landing']);
    }

    public agregaPrueba() {
        const api = '/tesis/insertaPrueba1';
        return this.rest.post(api, this.prueba).pipe(
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
