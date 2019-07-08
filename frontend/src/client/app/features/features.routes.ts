import { Route } from '@angular/router';
import { IndexComponent } from './index/index.component';
import { HomeComponent } from './home/home.component';
import { LandingComponent } from './landing/landing.component';
import { Prueba1Component } from './prueba1/prueba1.component';
import { Prueba2Component } from './prueba2/prueba2.component';
import { Prueba3Component } from './prueba3/prueba3.component';
import { Prueba4Component } from './prueba4/prueba4.component';
import { Prueba5Component } from './prueba5/prueba5.component';
import { PerfilComponent } from './perfil/perfil.component';
import { BienvenidaComponent } from './bienvenida/bienvenida.component';

export const FeaturesRoutes: Route[] = [
    {
        path: '',
        pathMatch: 'full',
        redirectTo: 'home'
    },
    {
        path: '',
        component: IndexComponent,
        children: [
            {
                path: 'home',
                component: HomeComponent
            },
            {
                path: 'landing',
                component: LandingComponent
            },
            {
                path: 'prueba1',
                component: Prueba1Component
            },
            {
                path: 'prueba2',
                component: Prueba2Component
            },
            {
                path: 'prueba3',
                component: Prueba3Component
            },
            {
                path: 'prueba4',
                component: Prueba4Component
            },
            {
                path: 'prueba5',
                component: Prueba5Component
            },
            {
                path: 'perfil',
                component: PerfilComponent
            },
            {
                path: 'bienvenida',
                component: BienvenidaComponent
            }

        ],
        //ROUTER CHILDREN LIMIT (NOT REMOVE - CLI COMPONENT)
        canActivate: []
    }
];
