package com.example.puce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puce.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    List<Teacher> findByLastName(String lastName);
    List<Teacher> findByAgeGreaterThan(Integer age);
    List<Teacher> findBySalaryLessThan(float salary);
}
