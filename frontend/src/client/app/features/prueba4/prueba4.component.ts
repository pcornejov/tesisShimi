import { Component } from '@angular/core';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';
import { Router } from '@angular/router';
import { RestService } from '../../services/rest/rest.service';
import { Prueba4 } from '../../classes/prueba4';
import { runInThisContext } from 'vm';
import { HttpResponse } from '@angular/common/http';
import { tap } from 'rxjs/operators/tap';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-prueba4',
    templateUrl: 'prueba4.component.html',
    styleUrls: ['prueba4.component.css'],
})
export class Prueba4Component {
    private pregunta2: string;
    private pregunta3: string;
    private pregunta4: string;
    private pregunta5: string;
    private pregunta6: string;
    private pregunta7: string;
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
    private pregunta20: string;
    private pregunta21: string;
    private pregunta22: string;
    private pregunta23: string;
    private pregunta24: string;
    private pregunta26: string;
    private pregunta27: string;
    private pregunta28: string;
    private pregunta29: string;
    private etica1: string;
    private etica2: string;
    private etica3: string;
    private etica4: string;
    private etica5: string;
    private riesgo1: string;
    private riesgo2: string;
    private riesgo3: string;
    private vyf1: string;
    private vyf2: string;
    private vyf3: string;
    private vyf4: string;
    private vyf5: string;
    private vyf6: string;
    private prueba4: Prueba4;
    private tiempoInicio: any = performance.now();
    private tiempoFin: any;
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) {
        this.prueba4 = new Prueba4();
        this.pregunta2 = '';
        this.pregunta3 = '';
        this.pregunta4 = '';
        this.pregunta5 = '';
        this.pregunta6 = '';
        this.pregunta7 = '';
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
        this.pregunta20 = '';
        this.pregunta21 = '';
        this.pregunta22 = '';
        this.pregunta23 = '';
        this.pregunta24 = '';
        this.pregunta26 = '';
        this.pregunta26 = '';
        this.pregunta27 = '';
        this.pregunta28 = '';
        this.pregunta29 = '';
        this.etica1 = '-1';
        this.etica2 = '-1';
        this.etica3 = '-1';
        this.etica4 = '-1';
        this.etica5 = '-1';
        this.riesgo1 = '-1';
        this.riesgo2 = '-1';
        this.riesgo3 = '-1';
        this.vyf1 = '';
        this.vyf2 = '';
        this.vyf3 = '';
        this.vyf4 = '';
        this.vyf5 = '';
        this.vyf6 = '';
    }

    public finalizar() {
        this.prueba4.pregunta2 = this.pregunta2;
        this.prueba4.pregunta3 = this.pregunta3;
        this.prueba4.pregunta4 = this.pregunta4;
        this.prueba4.pregunta5 = this.pregunta5;
        this.prueba4.pregunta6 = this.pregunta6;
        this.prueba4.pregunta7 = this.pregunta7;
        this.prueba4.pregunta9 = this.pregunta9;
        this.prueba4.pregunta10 = this.pregunta10;
        this.prueba4.pregunta11 = this.pregunta11;
        this.prueba4.pregunta12 = this.pregunta12;
        this.prueba4.pregunta13 = this.pregunta13;
        this.prueba4.pregunta14 = this.pregunta14;
        this.prueba4.pregunta15 = this.pregunta15;
        this.prueba4.pregunta16 = this.pregunta16;
        this.prueba4.pregunta17 = this.pregunta17;
        this.prueba4.pregunta18 = this.pregunta18;
        this.prueba4.pregunta20 = this.pregunta20;
        this.prueba4.pregunta21 = this.pregunta21;
        this.prueba4.pregunta22 = this.pregunta22;
        this.prueba4.pregunta23 = this.pregunta23;
        this.prueba4.pregunta24 = this.pregunta24;
        this.prueba4.pregunta26 = this.pregunta26;
        this.prueba4.pregunta27 = this.pregunta27;
        this.prueba4.pregunta28 = this.pregunta28;
        this.prueba4.pregunta29 = this.pregunta29;
        this.prueba4.etica1 = this.etica1;
        this.prueba4.etica2 = this.etica2;
        this.prueba4.etica3 = this.etica3;
        this.prueba4.etica4 = this.etica4;
        this.prueba4.etica5 = this.etica5;
        this.prueba4.riesgo1 = this.riesgo1;
        this.prueba4.riesgo2 = this.riesgo2;
        this.prueba4.riesgo3 = this.riesgo3;
        this.prueba4.vyf1 = this.vyf1;
        this.prueba4.vyf2 = this.vyf2;
        this.prueba4.vyf3 = this.vyf3;
        this.prueba4.vyf4 = this.vyf4;
        this.prueba4.vyf5 = this.vyf5;
        this.prueba4.vyf6 = this.vyf6;
        this.prueba4.rut = this.servicioRut.getRutPerfil().rut;
        this.agregaPrueba().subscribe((response: HttpResponse<any>) => {
        });
    }

    public agregaPrueba() {
        this.tiempoFin = performance.now();
        let minutos = ((this.tiempoFin - this.tiempoInicio) / (1000*60)) % 60;
        this.prueba4.tiempo = minutos;
        const api = '/tesis/insertaPrueba4';
        return this.rest.post(api, this.prueba4).pipe(
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
