package com.pluto.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @Classname RequestDemo5
 * @Description TODO
 * @Date 2020/3/19 20:56
 * @Created by Pluto
 */
@WebServlet("/requestdemo5")
public class RequestDemo5 extends HttpServlet {
    //get psot 都可以使用相同的方式获取请求参数
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//设置字符编码
        //post 获取请求参数 根据参数名称
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String[] hobbies= req.getParameterValues("hobby");//获取参数数组
      /*  for (String hobby:hobbies){
            System.out.println(hobby);
        }*/
         Enumeration<String> parameterNames= req.getParameterNames();
        /* while (parameterNames.hasMoreElements()){
             String name =parameterNames.nextElement();
             System.out .println(name);
             String value = req.getParameter(name);//不能获取数组
             System.out.println(value);
             System.out.println("------------------");
         }*/
        //获取所有参数的map集合
        Map<String,String[]> parameterMap=req.getParameterMap();
        //遍历
        //先获取map集合 然后获取所有的键 在获取每个键的值 一个键可能有多个值 所以需要遍历
        Set<String> keyset = parameterMap.keySet();
        for (String name:keyset){
            String[] values= parameterMap.get(name);
            System.out.println(name);
            for (String value:values){
                System.out.println(value);
            }
            System.out.println("-----------------------");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
