package com.example.hello.servlet.web.frontcontroller.v3;

import com.example.hello.servlet.web.frontcontroller.ModelAndVies;

import java.util.Map;

public interface ControllerV3 {
    ModelAndVies process(Map<String, String> paramMap);
}
