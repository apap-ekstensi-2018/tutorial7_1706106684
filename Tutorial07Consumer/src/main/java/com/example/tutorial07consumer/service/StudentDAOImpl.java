package com.example.tutorial07consumer.service;

import com.example.tutorial07consumer.dao.StudentDAO;
import com.example.tutorial07consumer.model.StudentModel;
import com.example.tutorial07consumer.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public StudentModel selectStudent(String npm) {
        StudentModel studentModel = restTemplate.getForObject(Config.PRODUCER_URL + "/student/view/" + npm, StudentModel.class);

        return studentModel;
    }

    @Override
    public List<StudentModel> selectAllStudents() {
        StudentModel[] studentModels = restTemplate.getForObject(Config.PRODUCER_URL + "/student/viewall/", StudentModel[].class);
        List<StudentModel> studentModelList = Arrays.asList(studentModels);

        return studentModelList;
    }
}
