package com.example.hello.servlet.web.frontcontroller.v3.controller;

import com.example.hello.servlet.web.frontcontroller.ModelAndVies;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelAndVies process(Map<String, String> paramMap) {
        return new ModelAndVies("new-form");
    }
}