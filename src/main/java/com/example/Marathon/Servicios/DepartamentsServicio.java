package com.example.Marathon.Servicios;
import com.example.Marathon.Modelos.Departaments;
import com.example.Marathon.Recursos.DepartamentsResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class DepartamentsServicio {
    @Autowired
    //vizualizar departamentos
    DepartamentsResources departamentsResources;
    public List<Departaments> getAllDepartaments(){
        return departamentsResources.findAll();
    }




    //crear nuevo departamentos
    public  Departaments saveUser(Departaments user){
        return departamentsResources.save(user);
    }
    //editar nuevo departamentos
    public Departaments updateById(Departaments request, Long id) {
        Optional<Departaments> optionalUser = departamentsResources.findById(id);
        if (optionalUser.isPresent()) {
            Departaments user = optionalUser.get();
            user.setName(request.getName());
            user.setPhone(request.getPhone());
            return departamentsResources.save(user);
        } else {
            // Manejar el caso en el que no se encuentre el usuario con el ID especificado
            throw new NoSuchElementException("No se encontró ningún usuario con el ID especificado: " + id);
        }
    }


}
