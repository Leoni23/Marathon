import { Component, OnInit } from '@angular/core';
import { DepartamentoService } from '../departamento.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-crear-departamento',
  templateUrl: './crear-departamento.component.html',
  styleUrls: ['./crear-departamento.component.css']
})
export class CrearDepartamentoComponent implements OnInit {
  nuevoDepartamento = { id:0, name: '', phone: 0, descripcion: '' };

  constructor(private departamentoService: DepartamentoService, private router: Router) { }

  ngOnInit(): void {
  }

  crearDepartamento(): void {
    this.departamentoService.crearDepartamento(this.nuevoDepartamento).subscribe(
      (response) => {
        console.log('Departamento creado exitosamente');
        // Después de crear el departamento, redireccionar a /departamentos
        this.router.navigate(['/departamentos']);
      },
      (error) => {
        console.log('Error al crear el departamento', error);
      }
    );
  }
}