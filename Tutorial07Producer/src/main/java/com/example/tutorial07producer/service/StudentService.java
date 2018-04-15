package com.example.tutorial07producer.service;

import java.util.List;

import com.example.tutorial07producer.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);

    List<StudentModel> selectAllStudents ();

    void addStudent (StudentModel student);

    void updateStudent (StudentModel student);

    void deleteStudent (String npm);
}
