package com.example.hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ModelAndVies {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelAndVies(String viewName) {
        this.viewName = viewName;
    }
}