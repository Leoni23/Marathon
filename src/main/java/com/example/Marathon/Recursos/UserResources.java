package com.example.Marathon.Recursos;

import com.example.Marathon.Modelos.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserResources extends JpaRepository<UserModel,Long> {
}

