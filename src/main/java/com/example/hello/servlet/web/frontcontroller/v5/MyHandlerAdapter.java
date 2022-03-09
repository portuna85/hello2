package com.example.hello.servlet.web.frontcontroller.v5;

import com.example.hello.servlet.web.frontcontroller.ModelAndVies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {
    boolean supports(Object handler);

    ModelAndVies handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
