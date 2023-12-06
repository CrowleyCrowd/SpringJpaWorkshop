package com.example.puce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.puce.model.Teacher;
import com.example.puce.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repository;

    public List<Teacher> listTeachers() {
        return repository.findAll();
    }

    public Teacher getTeacher(Integer id) {
        return repository.findById(id).get();
    }

    public List<Teacher> getTeacherByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    public List<Teacher> getTeacherByAgeGreaterThan(Integer age) {
        return repository.findByAgeGreaterThan(age);
    }

    public List<Teacher> getTeacherBySalaryLessThan(float salary) {
        return repository.findBySalaryLessThan(salary);
    }

    public void saveTeacher(Teacher teacher) {
        repository.save(teacher);
    }

    public void deleteTeacher(Integer id) {
        repository.deleteById(id);
    }

}
