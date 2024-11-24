package com.aos.controller;

import com.aos.pojo.SysUser;
import com.aos.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 12:43
 * 查询所有信息---->/employee-->get
 * 根据id查询信息---->/employee/1-->get
 * 跳转到添加页面---->/to/add-->get
 * 添加信息---->/employee-->post
 * 修改信息---->/employee-->put
 * 删除信息---->/employee/1-->delete
 */

@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value="/employee",method = RequestMethod.GET)
    public String getAllSysUsers(Model model){
        // 查询所有用户信息
        List<SysUser> sysUsers = sysUserService.getAllSysUsers();
        //将所有用户信息在请求域中共享
        model.addAttribute("sysUsers", sysUsers);
        return "sysUsers_list";
    }

}
