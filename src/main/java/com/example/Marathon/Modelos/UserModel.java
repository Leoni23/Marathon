package com.example.Marathon.Modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table (name ="enterprises")
public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;

    @Column private String address;
    @Column private String name;
    @Column private Integer phone;

    @OneToMany(mappedBy ="enterprises")
    @JsonProperty (access = JsonProperty.Access.WRITE_ONLY)
    private Set<Departaments > departaments=new HashSet<>();


    public Set<Departaments> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Set<Departaments> departaments) {
        this.departaments = departaments;
    }

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
