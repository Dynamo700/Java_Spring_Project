package com.projectapp.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectapp.restapi.models.programs;
public interface programsInterface extends JpaRepository <programs, Long>{
}
