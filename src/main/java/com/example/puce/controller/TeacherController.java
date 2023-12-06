package com.example.puce.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.puce.model.Teacher;
import com.example.puce.service.TeacherService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("/teachers")
    public List<Teacher> listTeachers() {
        return service.listTeachers();
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity<Teacher> getTeacher(Integer id) {
        try {
            Teacher teacher = service.getTeacher(id);
            return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Teacher>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/teachers/lastname/{lastName}")
    public List<Teacher> getTeacherByLastName(@PathVariable String lastName) {
        return service.getTeacherByLastName(lastName);
    }

    @GetMapping("/teachers/age/{age}")
    public List<Teacher> getTeacherByAgeGreaterThan(@PathVariable Integer age) {
        return service.getTeacherByAgeGreaterThan(age);
    }

    @GetMapping("/teachers/salary/{salary}")
    public List<Teacher> getTeacherBySalaryLessThan(@PathVariable float salary) {
        return service.getTeacherBySalaryLessThan(salary);
    }

    @PostMapping("/teachers")
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        service.saveTeacher(teacher);
        return teacher;
    }

    @PutMapping("/teachers/{id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable Integer id) {
        service.saveTeacher(teacher);
        Teacher teacherUpdated = service.getTeacher(id);
        return teacherUpdated;
    }

    @DeleteMapping("/teachers/{id}")
    public void deleteTeacher(@PathVariable Integer id) {
        service.deleteTeacher(id);
    }

}
