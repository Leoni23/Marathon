package com.example.Marathon.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="departaments")
public class Departaments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    @Column private String name;
    @Column private Integer phone;
    @Column private String descripcion;

    @ManyToOne (fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "id_enterprises")
    private UserModel enterprises;

    @OneToMany(mappedBy = "departaments")
    private List<DepartmentsEmployees> dpe;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UserModel getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(UserModel enterprises) {
        this.enterprises = enterprises;
    }


}
