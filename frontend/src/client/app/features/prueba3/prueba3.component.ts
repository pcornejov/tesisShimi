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
    private pregunta16: string;
    private pregunta17: string;
    private pregunta18: string;
    private pregunta19: string;
    private pregunta20: string;
    private pregunta21: string;
    private pregunta22: string;
    private pregunta23: string;
    private pregunta24: string;
    private pregunta25: string;
    private pregunta26: string;
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
    private vyf12: string;
    private vyf13: string;
    private vyf14: string;
    private vyf15: string;
    private vyf16: string;
    private vyf17: string;
    private vyf18: string;
    private vyf19: string;
    private vyf20: string;
    private vyf21: string;
    private vyf22: string;
    private vyf23: string;
    private vyf24: string;
    private selector1: string;
    private selector2: string;
    private selector3: string;
    private selector4: string;
    private selector5: string;
    private selector6: string;
    private selector7: string;
    private selector8: string;
    private prueba3: Prueba3;
    private tiempoInicio: any = performance.now();
    private tiempoFin: any;
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
        this.pregunta16 = '';
        this.pregunta17 = '';
        this.pregunta18 = '';
        this.pregunta19 = '';
        this.pregunta20 = '';
        this.pregunta21 = '';
        this.pregunta22 = '';
        this.pregunta23 = '';
        this.pregunta24 = '';
        this.pregunta25 = '';
        this.pregunta26 = '';
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
        this.vyf12 = '';
        this.vyf13 = '';
        this.vyf14 = '';
        this.vyf15 = '';
        this.vyf16 = '';
        this.vyf17 = '';
        this.vyf18 = '';
        this.vyf19 = '';
        this.vyf20 = '';
        this.vyf21 = '';
        this.vyf22 = '';
        this.vyf23 = '';
        this.vyf24 = '';
        this.selector1 = '-1';
        this.selector2 = '-1';
        this.selector3 = '-1';
        this.selector4 = '-1';
        this.selector5 = '-1';
        this.selector6 = '-1';
        this.selector7 = '-1';
        this.selector8 = '-1';
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
        this.prueba3.pregunta16 = this.pregunta16;
        this.prueba3.pregunta17 = this.pregunta17;
        this.prueba3.pregunta18 = this.pregunta18;
        this.prueba3.pregunta19 = this.pregunta19;
        this.prueba3.pregunta20 = this.pregunta20;
        this.prueba3.pregunta21 = this.pregunta21;
        this.prueba3.pregunta22 = this.pregunta22;
        this.prueba3.pregunta23 = this.pregunta23;
        this.prueba3.pregunta24 = this.pregunta24;
        this.prueba3.pregunta25 = this.pregunta25;
        this.prueba3.pregunta26 = this.pregunta26;
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
        this.prueba3.vyf12 = this.vyf12;
        this.prueba3.vyf13 = this.vyf13;
        this.prueba3.vyf14 = this.vyf14;
        this.prueba3.vyf15 = this.vyf15;
        this.prueba3.vyf16 = this.vyf16;
        this.prueba3.vyf17 = this.vyf17;
        this.prueba3.vyf18 = this.vyf18;
        this.prueba3.vyf19 = this.vyf19;
        this.prueba3.vyf20 = this.vyf20;
        this.prueba3.vyf21 = this.vyf21;
        this.prueba3.vyf22 = this.vyf22;
        this.prueba3.vyf23 = this.vyf23;
        this.prueba3.vyf24 = this.vyf24;
        this.prueba3.selector1 = this.selector1;
        this.prueba3.selector2 = this.selector2;
        this.prueba3.selector3 = this.selector3;
        this.prueba3.selector4 = this.selector4;
        this.prueba3.selector5 = this.selector5;
        this.prueba3.selector6 = this.selector6;
        this.prueba3.selector7 = this.selector7;
        this.prueba3.selector8 = this.selector8;
        this.prueba3.rut = this.servicioRut.getRutPerfil().rut;
        this.agregaPrueba().subscribe((response: HttpResponse<any>) => {
        });
    }

    public agregaPrueba() {
        this.tiempoFin = performance.now();
        let minutos = ((this.tiempoFin - this.tiempoInicio) / (1000*60)) % 60;
        this.prueba3.tiempo = minutos;
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
