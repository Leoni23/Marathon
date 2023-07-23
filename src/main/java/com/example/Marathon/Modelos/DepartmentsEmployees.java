package com.example.Marathon.Modelos;

import jakarta.persistence.*;
@Entity
@Table(name ="departments_employees")
public class DepartmentsEmployees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    @ManyToOne
    @JoinColumn(name = "id_departments")
    private Departaments departaments;

    @ManyToOne
    @JoinColumn(name = "id_employees")
    private Employees employees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Departaments getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departaments departaments) {
        this.departaments = departaments;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
}
