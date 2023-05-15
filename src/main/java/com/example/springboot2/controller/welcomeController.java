package com.example.springboot2.controller;



import com.example.springboot2.dto.HealthManageResult;
import com.example.springboot2.dto.Student;

import com.example.springboot2.filter.SystemUtil;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.*;


/**
 * @author Think
 * @Title: welocome
 * @ProjectName token-authentication
 * @Description: TODO
 * @date 2019/1/1815:4112211
 */
@RestController
@Log4j2
@RequestMapping("/wy")
public class welcomeController {

    @PostMapping ("/get/someStudent")
    public HealthManageResult postHealthManage()  {

        Student student1 = SystemUtil.currentUser();
        return HealthManageResult.ok(student1);

    };



}
