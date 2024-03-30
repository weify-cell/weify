package com.demo.common.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer customerId;
    private String customerName;
    private String phoneNum;
    private String sex;
    private String age;
 }