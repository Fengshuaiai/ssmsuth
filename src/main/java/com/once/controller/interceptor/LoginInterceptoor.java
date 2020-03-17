package com.once.controller.interceptor;

import com.once.pojo.AuthUser;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 这个是拦截用户登录的拦截器
 * 1.如果Session中有值则放行
 * 2.如果无值则拦截,并执行登录
 *      注此拦截器的优先级高于Controller
 *      需要在springmvc中配置拦截器的定义,需要告诉拦截器拦截那种类型的请求
 */
public class LoginInterceptoor /*extends HandlerInterceptorAdapter */{
    /**
     * 重写prehandle方法实现登录拦截器的功能
     * 返回ture 不拦截
     * 返回false 拦截
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
 /*   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            //获取session
            HttpSession session =request.getSession();
            //获取session中储存的User
            AuthUser authUser = (AuthUser) session.getAttribute("authUser");

            //判断user是否为空
            if (authUser.getName()==null&&authUser.getPwd()==null){
                //跳转登录界面
                System.err.println("跳转登录界面");
                 return false;
            }

        }catch (Exception e) {
            e.printStackTrace();
            System.err.println("拦截器报错");
        }
        System.err.println("跳转需求界面");
        return true;
    }*/
}
