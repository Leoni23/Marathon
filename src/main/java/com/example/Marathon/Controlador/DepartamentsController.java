package com.example.Marathon.Controlador;

import com.example.Marathon.Modelos.Departaments;
import com.example.Marathon.Servicios.DepartamentsServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/departaments")

public class DepartamentsController {
    @Autowired
    private DepartamentsServicio departamentsServicio;
    @GetMapping
    public ResponseEntity<List<Departaments>> getAllDepartaments() {
        List<Departaments> departamentsList = departamentsServicio.getAllDepartaments();
        return new ResponseEntity<>(departamentsList, HttpStatus.OK);
    }

    @PostMapping
    public Departaments saveUser(@RequestBody Departaments user){
        return this.departamentsServicio.saveUser(user);
    }

    @PutMapping(path = "/{id}")
    public Departaments updatebyId(@RequestBody Departaments user , @PathVariable("id") Long id){
      return this.departamentsServicio.updateById(user,id);
    }
}

