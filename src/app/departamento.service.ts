import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Departamento } from './departaments.model'; // Crea un modelo Departaments para representar los datos de los departamentos

@Injectable({
  providedIn: 'root'
})
export class DepartamentoService {
  private apiUrl = 'localhost:4001/departaments'; // Reemplaza "URL_DEL_BACKEND" con la URL de tu backend

  constructor(private http: HttpClient) { }

  getDepartamentos(): Observable<Departamento[]> {
    return this.http.get<Departamento[]>(this.apiUrl);
  }
  crearDepartamento(departamento: Departamento): Observable<any> {
    return this.http.post<any>(this.apiUrl, departamento);
  }
}