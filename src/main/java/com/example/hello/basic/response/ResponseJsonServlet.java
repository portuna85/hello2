package com.example.hello.basic.response;

import com.example.hello.basic.HelloData;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResponseJsonServlet", urlPatterns = "/reponse-json")
public class ResponseJsonServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Content-Type : application/json
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        HelloData helloData = new HelloData();
        helloData.setUsername("JSBAE");
        helloData.setAge(24);

        // {"username":"kim", "age":35}
        String result = objectMapper.writeValueAsString(helloData);
        response.getWriter().write(result);
    }
}
