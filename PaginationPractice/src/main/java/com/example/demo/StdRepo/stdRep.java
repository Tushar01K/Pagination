package com.example.demo.StdRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface stdRep extends JpaRepository<Student, Integer>{

}
