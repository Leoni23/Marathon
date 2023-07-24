import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaDepartamentosComponent } from './lista-departamentos/lista-departamentos.component';
import { MenuComponent } from './menu/menu.component';
import { CrearDepartamentoComponent } from './crear-departamento/crear-departamento.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    ListaDepartamentosComponent,
    MenuComponent,
    CrearDepartamentoComponent,
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
