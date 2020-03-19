package com.pluto.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description TODO
 * @Date 2020/3/19 18:09
 * @Created by Pluto
 */
@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // referer
        String referer = request.getHeader("referer");
        System.out.println(referer);
//可用来防盗链
        if (referer!=null){
            if (referer.contains("/")){
                System.out.println("执行");
                response.getWriter().write("没有盗链");
            }else {
                System.out.println("发现倒链了");
            }
        }

    }
}
