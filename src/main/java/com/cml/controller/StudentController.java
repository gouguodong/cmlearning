package com.cml.controller;

import com.cml.model.StudentEntity;
import com.cml.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2016/3/17.
 */
@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String findall() {
        /*return "index"：处理完该请求后返回的页面，此请求返回 index.jsp页面。*/

        StudentEntity student;
        List<StudentEntity> studentlist;
        studentlist = studentRepository.findAll();
        return "index";
    }

}
