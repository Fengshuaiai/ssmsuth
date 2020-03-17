package com.once.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个Controller是中间的那个页面集合
 * 功能说明:
 *         全部的中间的页面跳转 (放不下后面再说)
 */
@Controller
@RequestMapping("/central")
public class CentralController {

    /**
     * 中间首页跳转
     */
    @RequestMapping("/welcome")
    public String toWelcome(){
        return  "/central/welcome";
    }

}
