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
 * @Date 2020/3/19 18:02
 * @Created by Pluto
 */
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //user-agent 使用
        String agent = request.getHeader("user-agent");
        if (agent.contains("Chrome")){
            System.out.println("Chrome");
        }else if(agent.contains("Firefox")){
            System.out.println("Firefox");
        }else {
            System.out.println("Other");
        }
    }
}
