import { Component } from '@angular/core';
import { RestService } from '../../services/rest/rest.service';
import { Router } from '@angular/router';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-bienvenida',
    templateUrl: 'bienvenida.component.html',
    styleUrls: ['bienvenida.component.css'],
})
export class BienvenidaComponent {
    constructor(private rest: RestService, private router: Router) {}

    public continuar() {
        this.router.navigate(['landing']);
    }
}
