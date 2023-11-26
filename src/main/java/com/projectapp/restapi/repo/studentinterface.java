package com.projectapp.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectapp.restapi.models.student;
public interface studentinterface extends JpaRepository <student, Long>{
}
