package com.example.Marathon.Controlador;
import com.example.Marathon.Modelos.Departaments;
import com.example.Marathon.Modelos.Employees;
import com.example.Marathon.Servicios.EmployeesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employees")

public class EmployeesController {
    @Autowired
    private EmployeesServicio employeesServicio;
    @GetMapping
    public ArrayList<Employees> getuser(){
        return this.employeesServicio.getusers();
    }

    @PostMapping
    public Employees saveUser(@RequestBody Employees user){
        return this.employeesServicio.saveUser(user);
    }

    @PutMapping(path = "/{id}")
    public Employees updatebyId(@RequestBody Employees user , @PathVariable("id") Long id){
      return this.employeesServicio.updateById(user,id);
    }
}

