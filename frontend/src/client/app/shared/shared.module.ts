import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { NgxMyDatePickerModule } from 'ngx-mydatepicker';
import { PipesModule } from '../pipes/pipes.module';


/**
 * Do not specify providers for modules that might be imported by a lazy loaded module.
 */

@NgModule({
  imports: [CommonModule, RouterModule, FormsModule, NgxMyDatePickerModule, PipesModule],
  declarations:[],
  providers: [],
  exports: [
    CommonModule,
    FormsModule,
    RouterModule],
})
export class SharedModule {
}
