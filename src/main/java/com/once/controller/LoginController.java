package com.once.controller;

import com.once.pojo.AuthUser;
import com.once.service.IAuthUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/to")
public class LoginController {
    private IAuthUserService iAuthUserService;

    public IAuthUserService getiAuthUserService() {
        return iAuthUserService;
    }

    public void setiAuthUserService(IAuthUserService iAuthUserService) {
        this.iAuthUserService = iAuthUserService;
    }
    @ResponseBody
    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String  toLogin(String name, String password) throws  Exception{
        AuthUser authUser = new AuthUser();
        authUser.setName(name);
        authUser.setPwd(password);
        AuthUser SessionAuthUser=iAuthUserService.getAuthUser(authUser);
       /* Map<String ,Object> resultMap =new HashMap<String, Object>();*/

       /* *
        * 1.获取user/session准备放入用户
        * 2.创建返回函数,成功返回map
        */
       /*try {
            HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
            AuthUser authUser = new AuthUser();
            System.err.println("name"+name+"pwd"+password);
           *//* if(name!=null && password!=null){
                authUser.setName(name);
                authUser.setPwd(password);
                System.err.println("AuthUser"+authUser);
                AuthUser SessionAuthUser=iAuthUserService.getAuthUser(authUser);
                System.err.println("SessionAuthUser"+SessionAuthUser);
                if (SessionAuthUser.getName()!=null&&SessionAuthUser.getPwd()!=null){
                    session.setAttribute("authUser", SessionAuthUser);
                    resultMap.put("code", "1");
                }
            }*//*
            resultMap.put("code","2");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("code","0");
            resultMap.put("msg","网络异常,请稍后重试");
        }*/
//        System.err.println("resultMap"+resultMap.toString());
        return "login";
    }
}
