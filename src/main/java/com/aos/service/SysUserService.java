package com.aos.service;

import com.aos.pojo.SysUser;

import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 13:06
 */
public interface SysUserService {
    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> getAllSysUsers();

    SysUser findByUsername(String username);
    void update(String username, String password);
    void register(String username, String password);
}
