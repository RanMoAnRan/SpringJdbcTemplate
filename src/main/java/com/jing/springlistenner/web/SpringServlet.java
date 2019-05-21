package com.jing.springlistenner.web;

import com.jing.springlistenner.service.SpringService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "SpringServlet")
public class SpringServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //初始化容器
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("Springapplicaton.xml");
        SpringService springService = (SpringService) ac.getBean("springService");*/

        //通过工具类获取spring容器
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        SpringService springService = (SpringService) ac.getBean("springService");
        springService.test();

        PrintWriter writer = response.getWriter();
        writer.write("<h1>success</h1>");
    }
}
