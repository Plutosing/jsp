package com.pluto.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Classname ${NAME}
 * @Description TODO
 * @Date 2020/3/19 17:56
 * @Created by Pluto
 */
@WebServlet("/request1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头数据
        Enumeration<String> headerNames =request.getHeaderNames();

        while (headerNames.hasMoreElements()){
            String name=headerNames.nextElement();
            //通过名称获取请求头的值
            String value=request.getHeader(name);
            System.out.println(name+"---"+value);
        }
    }
}
