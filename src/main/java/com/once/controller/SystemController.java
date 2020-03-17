package com.once.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统管理目录
 *             系统设置
 *             栏目管理
 *             数据字典
 *             屏蔽词
 *             系统日志
 */
@Controller
@RequestMapping("/system")
public class SystemController {
    /**
     * 系统设置
     * @return
     */
    @RequestMapping("/system_base")
    public  String toSystem_base(){
        return "/system/system-base";
    }

    /**
     * 栏目管理
     * @return
     */
    @RequestMapping("/system_category")
    public  String toSystem_category(){
        return "/system/system-category";
    }

    /**
     * 数据字典
     * @return
     */
    @RequestMapping("/system_data")
    public  String toSystem_data(){
        return "/system/system-data";
    }

    /**
     * 屏蔽词
     * @return
     */
    @RequestMapping("/system_shielding")
    public  String toSystem_shielding(){
        return "/system/system-shielding";
    }

    /**
     * 系统日志
     * @return
     */
    @RequestMapping("/system_log")
    public  String toSystem_log(){
        return "/system/system-log";
    }
}
