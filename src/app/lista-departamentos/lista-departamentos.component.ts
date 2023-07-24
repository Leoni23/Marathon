import { Component, OnInit } from '@angular/core';
import { Departamento } from '../departaments.model';
import { DepartamentoService } from '../departamento.service';

@Component({
  selector: 'app-lista-departamentos',
  templateUrl: './lista-departamentos.component.html',
  styleUrls: ['./lista-departamentos.component.css']
})
export class ListaDepartamentosComponent implements OnInit {
  departamentos: Departamento[] = [];

  constructor(private departamentoService: DepartamentoService) { }

  ngOnInit(): void {
    this.departamentoService.getDepartamentos().subscribe(
      (data: Departamento[]) => {
        this.departamentos = data;
      },
      (error) => {
        console.log('Error al obtener los departamentos', error);
      }
    );
  }
}