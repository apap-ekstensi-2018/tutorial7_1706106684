package com.example.tutorial07consumer.service;

import com.example.tutorial07consumer.dao.StudentDAO;
import com.example.tutorial07consumer.model.StudentModel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public StudentModel selectStudent(String npm) {
        log.info("REST - select student with npm {}", npm);

        return studentDAO.selectStudent(npm);
    }

    @Override
    public List<StudentModel> selectAllStudents() {
        log.info("REST - select all students");

        return studentDAO.selectAllStudents();
    }

    @Override
    public void addStudent(StudentModel student) {}

    @Override
    public void updateStudent(StudentModel student) {}

    @Override
    public void deleteStudent(String npm) {}
}
