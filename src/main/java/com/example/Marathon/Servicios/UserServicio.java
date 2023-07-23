package com.example.Marathon.Servicios;

import com.example.Marathon.Modelos.UserModel;
import com.example.Marathon.Recursos.UserResources;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServicio {
    @Autowired
    //vizualizar empresa
    UserResources userResources;
    public ArrayList <UserModel> getusers(){
        return (ArrayList<UserModel>) userResources.findAll();
    }

    //crear nuevo empresa
    public  UserModel saveUser(UserModel user){
        return userResources.save(user);
    }
    //editar nuevo empresa
    public UserModel updateById(UserModel request, Long id) {
        Optional<UserModel> optionalUser = userResources.findById(id);
        if (optionalUser.isPresent()) {
            UserModel user = optionalUser.get();
            user.setAddress(request.getAddress());
            user.setName(request.getName());
            user.setPhone(request.getPhone());
            return userResources.save(user);
        } else {
            // Manejar el caso en el que no se encuentre el usuario con el ID especificado
            throw new NoSuchElementException("No se encontró ningún usuario con el ID especificado: " + id);
        }
    }


}
