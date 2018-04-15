package com.example.tutorial07consumer.dao;

import com.example.tutorial07consumer.model.StudentModel;

import java.util.List;

public interface StudentDAO {
    StudentModel selectStudent(String npm);
    List<StudentModel> selectAllStudents();
}
