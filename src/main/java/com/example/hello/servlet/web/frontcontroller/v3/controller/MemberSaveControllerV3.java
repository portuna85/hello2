package com.example.hello.servlet.web.frontcontroller.v3.controller;

import com.example.hello.servlet.domain.Member;
import com.example.hello.servlet.domain.MemberRepository;
import com.example.hello.servlet.web.frontcontroller.ModelAndVies;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelAndVies process(Map<String, String> paramMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelAndVies mv = new ModelAndVies("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}