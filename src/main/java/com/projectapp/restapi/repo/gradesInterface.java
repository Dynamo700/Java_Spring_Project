package com.projectapp.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectapp.restapi.models.grades;

public interface gradesInterface extends  JpaRepository <grades, Long>{
}
