package com.projectapp.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectapp.restapi.models.enrollment;


public interface enrollmentInterface extends JpaRepository <enrollment, Long>{
}
