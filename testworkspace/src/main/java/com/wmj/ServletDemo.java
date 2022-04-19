package com.wmj;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

//设置访问路径
@WebServlet(urlPatterns = "/demo",loadOnStartup = 1)
// 实现接口类的所有方法
public class ServletDemo implements Servlet {

    //1.初始化方法
    public void init (ServletConfig servletConfig) throws ServletException {
        /*
          初始化方法
          1.调用时机：默认情况下，servlet第一次new是创建
          2.调用次数：1次
                loadOnStartup:
        * @param ServletConfig
        **/
        System.out.println("init");

    }

    //2.获取servlet信息
    public ServletConfig getServletConfig() {
        return null;
    }

    //3.提供服务
    public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("这是我的第一个Servlet");

    }


    //4.返回servlet基本信息
    public String getServletInfo() {
        return null;
    }

    //5.销毁
    public void destroy() {

    }


}
