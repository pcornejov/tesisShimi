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
    private pregunta20: string;
    private pregunta21: string;
    private pregunta22: string;
    private etica1: string;
    private etica2: string;
    private etica3: string;
    private etica4: string;
    private etica5: string;
    private etica6: string;
    private etica7: string;
    private etica8: string;
    private etica9: string;
    private etica10: string;
    private etica11: string;
    private etica12: string;
    private etica13: string;
    private etica14: string;
    private etica15: string;
    private prueba4: Prueba4;
    constructor(private rest: RestService, private router: Router, private servicioRut: ServicioRutService) {
        this.prueba4 = new Prueba4();
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
        this.pregunta20 = '';
        this.pregunta21 = '';
        this.pregunta22 = '';
        this.etica1 = '-1';
        this.etica2 = '-1';
        this.etica3 = '-1';
        this.etica4 = '-1';
        this.etica5 = '-1';
        this.etica6 = '-1';
        this.etica7 = '-1';
        this.etica8 = '-1';
        this.etica9 = '-1';
        this.etica10 = '-1';
        this.etica11 = '-1';
        this.etica12 = '-1';
        this.etica13 = '-1';
        this.etica14 = '-1';
        this.etica15 = '-1';
    }

    public finalizar() {
        this.prueba4.pregunta1 = this.pregunta1;
        this.prueba4.pregunta2 = this.pregunta2;
        this.prueba4.pregunta3 = this.pregunta3;
        this.prueba4.pregunta4 = this.pregunta4;
        this.prueba4.pregunta5 = this.pregunta5;
        this.prueba4.pregunta6 = this.pregunta6;
        this.prueba4.pregunta7 = this.pregunta7;
        this.prueba4.pregunta8 = this.pregunta8;
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
        this.prueba4.etica1 = this.etica1;
        this.prueba4.etica2 = this.etica2;
        this.prueba4.etica3 = this.etica3;
        this.prueba4.etica4 = this.etica4;
        this.prueba4.etica5 = this.etica5;
        this.prueba4.etica6 = this.etica6;
        this.prueba4.etica7 = this.etica7;
        this.prueba4.etica8 = this.etica8;
        this.prueba4.etica9 = this.etica9;
        this.prueba4.etica10 = this.etica10;
        this.prueba4.etica11 = this.etica11;
        this.prueba4.etica12 = this.etica12;
        this.prueba4.etica13 = this.etica13;
        this.prueba4.etica14 = this.etica14;
        this.prueba4.etica15 = this.etica15;
        this.prueba4.rut = this.servicioRut.getRutPerfil().rut;
        this.agregaPrueba().subscribe((response: HttpResponse<any>) => {
        });
        this.router.navigate(['landing']);
    }

    public agregaPrueba() {
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
