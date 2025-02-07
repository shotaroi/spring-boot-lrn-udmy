package com.shotaroi.springboothibernatejpacrud.dao;

import com.shotaroi.springboothibernatejpacrud.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

}
