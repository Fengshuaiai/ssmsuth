package com.once.controller;

import com.once.pojo.AuthUser;
import com.once.pojo.User;
import com.once.service.IAuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/adminer")
public class IndexController {
/*
    @Autowired
    private IAuthUserService iauthUserService;

    public IAuthUserService getIauthUserService() {
        return iauthUserService;
    }

    public void setIauthUserService(IAuthUserService iauthUserService) {
        this.iauthUserService = iauthUserService;
    }

    *//**
     * 11/1 开发计划:
     * 	确定跳转方法 : 在WEB_INF外面由页面的from-action字段进入Controller,
     * 	              进入后开始查找控制器地址,控制器完成后返回值或者进行页面地址跳转
     * 	找出页面关联js的关键    11-4具体在地址前面加了 /
     * 	整合完成index页面      11-4完成
     * 	书写权限五张表,用户表,角色表,权限表,用户角色表,角色权限表详细字段  11-4/
     * 	完成数据库搭建   11-4/
     *//*

    *//**
     * 登录跳转测试
     * @return 11/1 测试通过
     *//*
    @RequestMapping(value = "/test",method = {RequestMethod.POST})
    public String test() {
        System.out.println("简单的首页测试");
        return "";
    }

    *//**
     * 登录跳转首页:
     *              与数据库交互判断账户是否正确,            暂定完成   11-4 上午
     *              把账户信息存在session中做一个单点登录    完成       11-4 上午
     *              跳转到index页面                         修改完成   11-4 上午
     * @return
     *//*
    @RequestMapping(value = "/index",method = {RequestMethod.POST})
    @ResponseBody
    public String toIndex( String name,String password) {

        *//**
         * 先获取到session然后进行下一步操作
         *  11-4 日  疑问1:ServletRequestAttributes 为什么要强转
         *  RequestContextHolder.getRequestAttributes()是那个包有什么东西,可以获取什么
         *//*
        *//*HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession  session =  request.getSession();*//*
        HttpSession session = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        AuthUser authUser = new AuthUser();
        if(name!=null && name!=""){
            //存入session

            session.setAttribute("User", authUser);
            return "index/index";// 跳转到index页面
        }
        return "redirect:/login.jsp";//返回登录界面
    }

    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> toLogin(String name, String password) throws  Exception{
        Map<String ,Object> resultMap =new HashMap<String, Object>();
        *//**
         * 1.获取user/session准备放入用户
         * 2.创建返回函数,成功返回map
         *//*
        try {
            HttpSession session = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
            AuthUser authUser = new AuthUser();
            if(name!=null && password!=null){
                authUser.setName(name);
                authUser.setPwd(password);
                AuthUser SessionAuthUser=iauthUserService.getAuthUser(authUser);
                if (SessionAuthUser.getName()!=null&&SessionAuthUser.getPwd()!=null){
                    session.setAttribute("authUser", SessionAuthUser);
                    resultMap.put("code", "1");
                }
            }
            resultMap.put("code","2");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("code","0");
            resultMap.put("msg","网络异常,请稍后重试");
        }
        return resultMap;
    }*/
}
