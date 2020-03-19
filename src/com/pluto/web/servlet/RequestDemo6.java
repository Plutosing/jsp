package com.pluto.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname RequestDemo6
 * @Description TODO
 * @Date 2020/3/19 21:50
 * @Created by Pluto
 */
@WebServlet("/requestdemo6")
public class RequestDemo6 extends HttpServlet {
    //请求转发
    // 1 通过request对象获取请求转发器 ：RequestDispatcher getRequestDispatcher(String path)
    // 2 使用RequestDispatcher 对象进行转发：forward(ServletRequest requset,ServletResponse response)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("6被访问了");
       //转发到7
        req.getRequestDispatcher("/requestdemo7").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
