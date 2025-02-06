package com.shotaroi.springboothibernatejpacrud.dao;

import com.shotaroi.springboothibernatejpacrud.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);

}
