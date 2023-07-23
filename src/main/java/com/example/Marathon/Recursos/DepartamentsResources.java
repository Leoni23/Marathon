package com.example.Marathon.Recursos;

import com.example.Marathon.Modelos.Departaments;
import com.example.Marathon.Modelos.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentsResources extends JpaRepository<Departaments,Long> {
}


