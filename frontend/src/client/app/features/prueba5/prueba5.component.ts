import { Component } from '@angular/core';
import { Prueba5 } from '../../classes/prueba5';
import { Router } from '@angular/router';
import { HttpResponse } from '@angular/common/http';
import { RestService } from '../../services/rest/rest.service';
import { ServicioRutService } from '../../services/servicioRut/servicioRut.service';
import { tap } from 'rxjs/operators/tap';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-prueba5',
    templateUrl: 'prueba5.component.html',
    styleUrls: ['prueba5.component.css'],
})
export class Prueba5Component {
    
    private selector1: string;
    private selector2: string;
    private selector3: string;
    private selector4: string;
    private selector5: string;
    private selector6: string;
    private selector7: string;
    private selector8: string;
    private selector9: string;
    private selector10: string;
    private selector11: string;
    private selector12: string;
    private selector13: string;
    private selector14: string;
    private selector15: string;
    private selector16: string;
    private selector17: string;
    private selector18: string;
    private selector19: string;
    private selector20: string;
    private selector21: string;
    private selector22: string;
    private selector23: string;
    
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
    private selector24: string;
    private selector25: string;
    private selector26: string;
    private pregunta2: string;
    private pregunta3: string;
    private pregunta5: string;
    private pregunta6: string;
    private pregunta7: string;
    private pregunta8: string;
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
    private selector27: string;
    private selector28: string;
    private selector29: string;
    private selector30: string;
    private selector31: string;
    private selector32: string;
    private selector33: string;
    private selector34: string;
    private selector35: string;
    private selector36: string;
    private selector37: string;
    private selector38: string;
    private pregunta24: string;
    private pregunta25: string;
    private pregunta26: string;
    private pregunta27: string;
    private pregunta28: string;
    private pregunta29: string;
    private pregunta30: string;
    private pregunta31: string;
    private selector39: string;
    private selector40: string;
    private selector41: string;
    private selector42: string;
    private selector43: string;
    private selector44: string;
    private selector45: string;
    private selector46: string;
    private selector47: string;
    private selector48: string;
    private prueba5: Prueba5;
    private tiempoInicio: any = performance.now();
    private tiempoFin: any;
    constructor(private router: Router, private rest: RestService, private servicioRut: ServicioRutService) {
        this.prueba5 = new Prueba5();
        this.pregunta2 = '';
        this.pregunta3 = '';
        this.pregunta5 = '';
        this.pregunta6 = '';
        this.pregunta7 = '';
        this.pregunta8 = '';
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
        this.pregunta27 = '';
        this.pregunta28 = '';
        this.pregunta29 = '';
        this.pregunta30 = '';
        this.pregunta31 = '';
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
        this.selector1 = '-1';
        this.selector2 = '-1';
        this.selector3 = '-1';
        this.selector4 = '-1';
        this.selector5 = '-1';
        this.selector6 = '-1';
        this.selector7 = '-1';
        this.selector8 = '-1';
        this.selector9 = '-1';
        this.selector10 = '-1';
        this.selector11 = '-1';
        this.selector12 = '-1';
        this.selector13 = '-1';
        this.selector14 = '-1';
        this.selector15 = '-1';
        this.selector16 = '-1';
        this.selector17 = '-1';
        this.selector18 = '-1';
        this.selector19 = '-1';
        this.selector20 = '-1';
        this.selector21 = '-1';
        this.selector22 = '-1';
        this.selector23 = '-1';
        this.selector24 = '-1';
        this.selector25 = '-1';
        this.selector26 = '-1';
        this.selector27 = '-1';
        this.selector28 = '-1';
        this.selector29 = '-1';
        this.selector30 = '-1';
        this.selector31 = '-1';
        this.selector32 = '-1';
        this.selector33 = '-1';
        this.selector34 = '-1';
        this.selector35 = '-1';
        this.selector36 = '-1';
        this.selector37 = '-1';
        this.selector38 = '-1';
        this.selector39 = '-1';
        this.selector40 = '-1';
        this.selector41 = '-1';
        this.selector42= '-1';
        this.selector43 = '-1';
        this.selector44 = '-1';
        this.selector45 = '-1';
        this.selector46 = '-1';
        this.selector47 = '-1';
        this.selector48 = '-1';
    }
    public finalizar() {
        this.prueba5.pregunta2 = this.pregunta2;
        this.prueba5.pregunta3 = this.pregunta3;
        this.prueba5.pregunta5 = this.pregunta5;
        this.prueba5.pregunta6 = this.pregunta6;
        this.prueba5.pregunta7 = this.pregunta7;
        this.prueba5.pregunta8 = this.pregunta8;
        this.prueba5.pregunta10 = this.pregunta10;
        this.prueba5.pregunta11 = this.pregunta11;
        this.prueba5.pregunta12 = this.pregunta12;
        
        this.prueba5.pregunta13 = this.pregunta13;
        this.prueba5.pregunta14 = this.pregunta14;
        this.prueba5.pregunta15 = this.pregunta15;
        this.prueba5.pregunta16 = this.pregunta16;
        this.prueba5.pregunta17 = this.pregunta17;
        this.prueba5.pregunta18 = this.pregunta18;
        this.prueba5.pregunta19 = this.pregunta19;
        this.prueba5.pregunta20 = this.pregunta20;
        this.prueba5.pregunta21 = this.pregunta21;
        this.prueba5.pregunta22 = this.pregunta22;
        
        this.prueba5.pregunta23 = this.pregunta23;
        this.prueba5.pregunta24 = this.pregunta24;
        this.prueba5.pregunta25 = this.pregunta25;
        this.prueba5.pregunta26 = this.pregunta26;
        this.prueba5.pregunta27 = this.pregunta27;
        this.prueba5.pregunta28 = this.pregunta28;
        this.prueba5.pregunta29 = this.pregunta29;
        this.prueba5.pregunta30 = this.pregunta30;
        this.prueba5.pregunta31 = this.pregunta31;
        
        this.prueba5.vyf1 = this.vyf1;
        this.prueba5.vyf2 = this.vyf2;
        this.prueba5.vyf3 = this.vyf3;
        this.prueba5.vyf4 = this.vyf4;
        this.prueba5.vyf5 = this.vyf5;
        this.prueba5.vyf6 = this.vyf6;
        this.prueba5.vyf7 = this.vyf7;
        this.prueba5.vyf8 = this.vyf8;
        this.prueba5.vyf9 = this.vyf9;
        this.prueba5.vyf10 = this.vyf10;
        this.prueba5.selector1 = this.selector1;
        this.prueba5.selector2 = this.selector2;
        this.prueba5.selector3 = this.selector3;
        this.prueba5.selector4 = this.selector4;
        this.prueba5.selector5 = this.selector5;
        this.prueba5.selector6 = this.selector6;
        this.prueba5.selector7 = this.selector7;
        this.prueba5.selector8 = this.selector8;
        this.prueba5.selector9 = this.selector9;
        this.prueba5.selector10 = this.selector10;
        this.prueba5.selector11 = this.selector11;
        this.prueba5.selector12 = this.selector12;
        this.prueba5.selector13 = this.selector13;
        this.prueba5.selector14 = this.selector14;
        this.prueba5.selector15 = this.selector15;
        this.prueba5.selector16 = this.selector16;
        this.prueba5.selector17 = this.selector17;
        this.prueba5.selector18 = this.selector18;
        this.prueba5.selector19 = this.selector19;
        this.prueba5.selector20 = this.selector20;
        this.prueba5.selector21 = this.selector21;
        this.prueba5.selector22 = this.selector22;
        this.prueba5.selector23 = this.selector23;
        this.prueba5.selector24 = this.selector24;
        this.prueba5.selector25 = this.selector25;
        this.prueba5.selector26 = this.selector26;
        this.prueba5.selector27 = this.selector27;
        this.prueba5.selector28 = this.selector28;
        this.prueba5.selector29 = this.selector29;
        this.prueba5.selector30 = this.selector30;
        this.prueba5.selector31 = this.selector31;
        this.prueba5.selector32 = this.selector32;
        this.prueba5.selector33 = this.selector33;
        this.prueba5.selector34 = this.selector34;
        this.prueba5.selector35 = this.selector35;
        this.prueba5.selector36 = this.selector36;
        this.prueba5.selector37 = this.selector37;
        this.prueba5.selector38 = this.selector38;
        this.prueba5.selector39 = this.selector39;
        this.prueba5.selector40 = this.selector40;
        this.prueba5.selector41 = this.selector41;
        this.prueba5.selector42 = this.selector42;
        this.prueba5.selector43 = this.selector43;
        this.prueba5.selector44 = this.selector44;
        this.prueba5.selector45 = this.selector45;
        this.prueba5.selector46 = this.selector46;
        this.prueba5.selector47 = this.selector47;
        this.prueba5.selector48 = this.selector48;
        this.prueba5.rut = this.servicioRut.getRutPerfil().rut;
        this.agregaPrueba().subscribe((response: HttpResponse<any>) => {
        });
    }

    public agregaPrueba() {
        this.tiempoFin = performance.now();
        let minutos = ((this.tiempoFin - this.tiempoInicio) / (1000*60)) % 60;
        this.prueba5.tiempo = minutos;
        const api = '/tesis/insertaPrueba5';
        return this.rest.post(api, this.prueba5).pipe(
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
