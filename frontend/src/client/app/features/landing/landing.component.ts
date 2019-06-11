import { Component } from '@angular/core';
import { Router } from '@angular/router';
/**
* This class represents the main application component.
*/
@Component({
    moduleId: module.id,
    selector: 'sd-landing',
    templateUrl: 'landing.component.html',
    styleUrls: ['landing.component.css'],
})
export class LandingComponent {
    constructor(private router: Router) {}

    private prueba1() {
        this.router.navigate(['prueba1']);
    }
    private prueba2() {
        this.router.navigate(['prueba2']);
    }
    private prueba3() {
        this.router.navigate(['prueba3']);
    }
    private prueba4() {
        this.router.navigate(['prueba4']);
    }
    private prueba5() {
        this.router.navigate(['prueba5']);
    }
}


