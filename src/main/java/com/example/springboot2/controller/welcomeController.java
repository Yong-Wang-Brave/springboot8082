package com.example.springboot2.controller;



import com.example.springboot2.dto.HealthManageResult;
import com.example.springboot2.dto.Student;

import com.example.springboot2.filter.SystemUtil;
import lombok.extern.log4j.Log4j2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Think
 * @Title: welocome
 * @ProjectName token-authentication
 * @Description: TODO
 * @date 2019/1/1815:4112211
 */
@RestController
@Slf4j
@RequestMapping("/wy")
public class welcomeController {

    @PostMapping ("/get/someStudent")
    public HealthManageResult postHealthManage()  {

        Student student1 = SystemUtil.currentUser();
        return HealthManageResult.ok(student1);

    };

    @PostMapping ("/get/someStudent2")
    public HealthManageResult postHealthManage2()  {
        List<Student> students =new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Student student1 = new Student();
            student1.setCardNo("11");
            students.add(student1);
        }

        return HealthManageResult.ok(students);

    };


}
