package com.example.springboot2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @NotEmpty(message = "姓名不可为空")
    String name;
    @NotEmpty(message = "年龄不可为空")
    String age;
    @NotEmpty(message = "卡号不可为空")
    String cardNo;

    String cardNo1;
}
