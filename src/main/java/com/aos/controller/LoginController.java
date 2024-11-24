package com.aos.controller;

import com.aos.pojo.SysUser;
import com.aos.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Author：bingfeng
 * @Date：2024/10/17 14:55
 */
@Controller
public class LoginController {

    @Autowired
    private SysUserService sysUserService;

        @RequestMapping("/login")
    public String login(@RequestParam String username,
                                        @RequestParam String password) {
        SysUser user = sysUserService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "firstpage";
        }
        return "Invalid credentials";

    }
    @RequestMapping("/registerfisrt")
    public  String registerfisrt(){
        return "login/register";
    }
    @RequestMapping(value = "/register")
    public String register(String username, String password) {
        sysUserService.register(username, password);
        return "login/login"; // 返回注册成功的视图
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public String updatePassword(@RequestParam String username, @RequestParam String oldPassword, @RequestParam String newPassword) {
        SysUser user = sysUserService.findByUsername(username);
        if (user != null) {
        }
        return "旧密码错误"; // 返回错误信息
    }

}
