import { NgModule } from '@angular/core';
import { ServicioRutService } from './servicioRut/servicioRut.service';
import { RestService } from './rest/rest.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
/**
* Especificamos el modulo
*/

@NgModule({
    imports: [CommonModule, RouterModule],
    declarations: [],
    providers:[RestService, ServicioRutService],
    exports: [CommonModule, FormsModule, RouterModule]

})
export class ServicesModule {
}
