package com.example.springboot2.filter;

import cn.hutool.core.util.StrUtil;

import com.alibaba.fastjson.JSON;
import com.example.springboot2.dto.Student;
import org.slf4j.MDC;

public class SystemUtil {

    public static Student currentUser(){
        String userInfo= MDC.get(Constants.USER_INFO);
        if (StrUtil.isNotEmpty(userInfo)) {
            return JSON.parseObject(userInfo,Student.class);
        }
        throw new RuntimeException("获取登录用户失败。");
    }
}
