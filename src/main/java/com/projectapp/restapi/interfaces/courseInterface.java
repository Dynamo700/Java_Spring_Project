package com.projectapp.restapi.interfaces;

import com.projectapp.restapi.models.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseInterface extends JpaRepository<course, Long> {
}
