package com.aos.service.impl;

import com.aos.mapper.SysUserMapper;
import com.aos.pojo.SysUser;
import com.aos.service.SysUserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 13:07
 */

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
//    @Autowired
//    private SqlSessionFactory sqlSessionFactory;


    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> getAllSysUsers(){
        return sysUserMapper.selectByExample(null);
    };

    @Override
    public SysUser findByUsername(String username) {
        SysUser user = sysUserMapper.findByUsername(username);
        return user;
    }
    @Override
    public void update(String username, String password) {
        sysUserMapper.update(username, password);
    }
    @Override
    public void register(String username, String password) {
        sysUserMapper.register(username, password);
    }

}
