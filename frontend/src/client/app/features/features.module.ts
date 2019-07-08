import { NgModule } from '@angular/core';
import { BienvenidaComponent } from './bienvenida/bienvenida.component';
import { PerfilComponent } from './perfil/perfil.component';
import { LandingComponent } from './landing/landing.component';
import { Prueba5Component } from './prueba5/prueba5.component';
import { Prueba4Component } from './prueba4/prueba4.component';
import { Prueba3Component } from './prueba3/prueba3.component';
import { Prueba2Component } from './prueba2/prueba2.component';
import { Prueba1Component } from './prueba1/prueba1.component';
import { HomeComponent } from './home/home.component';
import { IndexComponent } from './index/index.component';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { SharedModule } from '../shared/shared.module';
import { PipesModule } from '../pipes/pipes.module';
import { DirectivesModule } from '../directives/directives.module';
import { NgxMyDatePickerModule } from 'ngx-mydatepicker';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
/**
* Especificamos el modulo
*/

@NgModule({
    imports: [
        CommonModule,
        RouterModule,
        SharedModule,
        PipesModule,
        DirectivesModule,
        NgxMyDatePickerModule,
        NgbModule
    ],
    declarations: [
        HomeComponent,
        IndexComponent,
        Prueba1Component,
        Prueba2Component,
        Prueba3Component,
        Prueba4Component,
        Prueba5Component,
        LandingComponent,
        PerfilComponent,
        BienvenidaComponent
    ],
    exports: [
        CommonModule,
        FormsModule,
        RouterModule,
        HomeComponent,
        IndexComponent,
        Prueba1Component,
        Prueba2Component,
        Prueba3Component,
        Prueba4Component,
        Prueba5Component,
        LandingComponent,
        PerfilComponent,
        BienvenidaComponent
    ]

})
export class FeaturesModule {
}
