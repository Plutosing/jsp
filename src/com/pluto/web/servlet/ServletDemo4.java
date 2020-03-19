package com.pluto.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Classname ServletDemo4
 * @Description TODO
 * @Date 2020/3/19 15:16
 * @Created by Pluto
 */
@WebServlet("/demo4")
public class ServletDemo4  extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        将servlet中其它的方法默认做了空实现
        System.out.println("GenericServlet 实现servlet");
    }
}
