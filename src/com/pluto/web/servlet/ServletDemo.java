package com.pluto.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Classname ServletDemo
 * @Description TODO
 * @Date 2020/3/19 0:00
 * @Created by Pluto
 */
public class ServletDemo  implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
