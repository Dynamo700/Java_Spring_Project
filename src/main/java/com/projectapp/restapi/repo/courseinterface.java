package com.projectapp.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectapp.restapi.models.course;

public interface courseinterface extends JpaRepository <course, Long>{
}
