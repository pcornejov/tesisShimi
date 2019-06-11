import { Component } from '@angular/core';
import { RestService } from '../../services/rest/rest.service';
import { Observable } from 'rxjs/Observable';
import { tap } from 'rxjs/operators/tap';
import { HttpResponse } from '@angular/common/http';
import { Route, Router } from '@angular/router';
import { rutYPerfil } from '../../classes/rutyperfil';

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
    constructor(private rest: RestService, private router: Router) {
        
        // Constructor code
    }

    public ingresar() {
        this.router.navigate(['landing']);
        this.retornoIngresar().subscribe((response: HttpResponse<any>) => {
            
        })        
    }
    public retornoIngresar(): Observable<HttpResponse<any>> {
        const api= '/tesis/insertaRut';
        let ryp = new rutYPerfil();
        ryp.rut =  this.rut;
        return this.rest.post(api, ryp).pipe(
            tap((response: HttpResponse<any>) => {
                if (response.status !== 200 && response.status !== 204) {
                    throw new Error(response.status.toString());
                }
            })
        );
    }
}
