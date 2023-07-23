package com.example.Marathon.Servicios;

import com.example.Marathon.Modelos.Employees;
import com.example.Marathon.Recursos.EmployeesResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmployeesServicio {
    @Autowired
    //vizualizar departamentos
    EmployeesResources employeesResources;
    public ArrayList <Employees> getusers(){
        return (ArrayList<Employees>) employeesResources.findAll();
    }

    //crear nuevo departamentos
    public  Employees saveUser(Employees user){
        return employeesResources.save(user);
    }
    //editar nuevo departamentos
    public Employees updateById(Employees request, Long id) {
        Optional<Employees> optionalUser = employeesResources.findById(id);
        if (optionalUser.isPresent()) {
            Employees user = optionalUser.get();
            user.setAge(request.getAge());
            user.setName(request.getName());
            user.setEmail(request.getEmail());
            user.setPosition(request.getPosition());
            user.setSurname(request.getSurname());

            return employeesResources.save(user);
        } else {
            // Manejar el caso en el que no se encuentre el usuario con el ID especificado
            throw new NoSuchElementException("No se encontró ningún usuario con el ID especificado: " + id);
        }
    }


}
