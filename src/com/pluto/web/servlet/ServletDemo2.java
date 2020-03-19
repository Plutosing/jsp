package com.pluto.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Classname ServletDemo2
 * @Description TODO
 * @Date 2020/3/19 0:20
 * @Created by Pluto
 */

/**
 * servlet是单例的
 * 多个用户访问时可能存在线程安全问题
 * 尽量不要在Servlet中定义成员变量
 * 即使定义了不要赋值
 */
@WebServlet("/demo2")
public class ServletDemo2 implements Servlet {


    /**
     * servlet 初始化执行 被创建时
     * 只执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    System.out.println("init");
    }

    /**
     * 配置
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务时 每次访问都会指向此方法
     * 可执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    /**
     * 获取servlet 信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 在servlet被销毁时 一般用于释放资源
     * 服务器关闭 销毁
     * 只执行一次
     */
    @Override
    public void destroy() {

    }
}
