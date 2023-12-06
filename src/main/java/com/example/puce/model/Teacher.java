package com.example.puce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

    @Id
    private Integer id;
    private String name;
    private String lastName;
    private Integer age;
    private float salary;
    private Integer experience;
    private String phone;

    
    public Teacher(Integer id, String name, String lastName, Integer age, float salary, Integer experience,
            String phone) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.phone = phone;
    }

    public Teacher() {
        super();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
