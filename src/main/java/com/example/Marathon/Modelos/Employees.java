package com.example.Marathon.Modelos;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name ="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    @Column private Integer age;
    @Column private String email;
    @Column private String name;
    @Column private String position;
    @Column private String surname;
    @OneToMany(mappedBy = "employees")
    private List<DepartmentsEmployees> dpe;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
