package com.projectapp.restapi.interfaces;
import com.projectapp.restapi.models.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentInterface extends JpaRepository<student, Long>{
}
