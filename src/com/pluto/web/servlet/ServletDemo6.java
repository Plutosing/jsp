package com.pluto.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ServletDemo6
 * @Description TODO
 * @Date 2020/3/19 15:27
 * @Created by Pluto
 */
@WebServlet({"/d6","/dd6","/ddd6"})
public class ServletDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("doget 多url配置");
    }
}
