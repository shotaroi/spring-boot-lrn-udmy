package com.shotaroi.springboothibernatejpacrud;

import com.shotaroi.springboothibernatejpacrud.dao.StudentDAO;
import com.shotaroi.springboothibernatejpacrud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHibernateJpaCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHibernateJpaCrudApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
//            createMultipleStudents(studentDAO);
            readStudent(studentDAO);
        };
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");

        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);

        System.out.println("retrieving student with id: " + theId);
        Student myStudent = studentDAO.findById(theId);

        System.out.println("Found the student: " + myStudent);
    }

    public void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating 3 student objects ... ");
        Student tempStudent1 = new Student("John", "Doe", "John@gmail.com");
        Student tempStudent2 = new Student("Taylor", "Swift", "Taylor@gmail.com");
        Student tempStudent3 = new Student("Keanu", "Leevs", "Keanu@gmail.com");

        System.out.println("Saving the students ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student tempStudent = new Student("Elon", "Musk", "elon@gmail.com");

        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());
    }
}
