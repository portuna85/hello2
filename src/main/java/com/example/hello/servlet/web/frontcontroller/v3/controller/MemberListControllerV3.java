package com.example.hello.servlet.web.frontcontroller.v3.controller;

import com.example.hello.servlet.domain.Member;
import com.example.hello.servlet.domain.MemberRepository;
import com.example.hello.servlet.web.frontcontroller.ModelAndVies;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelAndVies process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();

        ModelAndVies mv = new ModelAndVies("members");
        mv.getModel().put("member", members);
        return mv;
    }
}