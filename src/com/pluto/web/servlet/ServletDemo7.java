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
 * @Date 2020/3/19 17:43
 * @Created by Pluto
 */
@WebServlet("/demo7")
public class ServletDemo7 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String method = req.getMethod();
        String contextpath = req.getContextPath();
        //虚拟目录 *
       String servletpath= req.getServletPath();
        //servlet 路径
       String Query= req.getQueryString();
        //参数
        req.getRequestURI();
        //uri *
        req.getRequestURL();
        //url *
        req.getProtocol();
        //http 协议版本
        req.getRemoteAddr();
        //客户机ip
        System.out.println(method);
        System.out.println(contextpath);
        System.out.println(servletpath);
        System.out.println(Query);
        System.out.println(req.getRemoteAddr());
    }
}
