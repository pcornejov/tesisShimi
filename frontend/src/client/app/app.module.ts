import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { APP_BASE_HREF } from '@angular/common';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';

import { ServicesModule } from './services/services.module';
import { FeaturesModule } from './features/features.module';
import { PipesModule } from './pipes/pipes.module';
import { DirectivesModule } from './directives/directives.module';
import { SharedModule } from './shared/shared.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { NgxMyDatePickerModule } from 'ngx-mydatepicker';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
declare var BASE_LOCATION_HREF: any;

@NgModule({
    imports: [BrowserModule, HttpModule, HttpClientModule, AppRoutingModule, SharedModule,
        ServicesModule, FeaturesModule, PipesModule, DirectivesModule, NgxMyDatePickerModule.forRoot(), NgbModule.forRoot(),
        BrowserAnimationsModule],
    declarations: [AppComponent],
    providers: [{
        provide: APP_BASE_HREF,
        useValue: BASE_LOCATION_HREF
    }],
    bootstrap: [AppComponent]

})
export class AppModule {
    constructor() {
        console.log(BASE_LOCATION_HREF);
    }
}
