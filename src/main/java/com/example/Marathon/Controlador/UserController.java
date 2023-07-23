package com.example.Marathon.Controlador;

import com.example.Marathon.Modelos.UserModel;
import com.example.Marathon.Servicios.UserServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Usermodel")

public class UserController {
    @Autowired
    private UserServicio userServicio;
    @GetMapping
    public ArrayList<UserModel> getuser(){
        return this.userServicio.getusers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userServicio.saveUser(user);
    }

    @PutMapping(path = "/{id}")
    public UserModel updatebyId(@RequestBody UserModel user , @PathVariable("id") Long id){
      return this.userServicio.updateById(user,id);
    }
}

