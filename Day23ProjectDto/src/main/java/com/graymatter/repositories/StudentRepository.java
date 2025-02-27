package com.graymatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
