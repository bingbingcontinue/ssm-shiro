package com.aos.shiro;

import org.apache.shiro.realm.Realm;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 18:10
 */
public class ShiroRealm implements Realm {
    @Override
    public boolean supports(org.apache.shiro.authc.AuthenticationToken token) {
        return true;
    }
    @Override
    public org.apache.shiro.authc.AuthenticationInfo getAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken token) throws org.apache.shiro.authc.AuthenticationException {
        return null;
    }
    @Override
    public String getName() {
        return null;
    }

}
