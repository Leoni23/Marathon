import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaDepartamentosComponent } from './lista-departamentos/lista-departamentos.component'; // Ajusta la ruta según la ubicación real del componente
import { CrearDepartamentoComponent } from './crear-departamento/crear-departamento.component'; 
const routes: Routes = [
  { path: 'departamentos/listar', component: ListaDepartamentosComponent },
  { path: 'departamentos/crear', component: CrearDepartamentoComponent },
  // Puedes agregar más rutas para otros componentes aquí
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }