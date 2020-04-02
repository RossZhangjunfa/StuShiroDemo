package com.ross.service;

import com.ross.pojo.Permission;
import com.ross.pojo.User;

import java.util.List;

/**
 * @author zjf
 */
public interface ShiroService {
    /**
     * 根据账户获取密码
     * @param userName  账户
     * @return  返回User实体类
     */
    User getUserByUserName(String userName);

    /**
     * 根据账号获取该账号的权限
     * @param user
     * @return  list<Permission>  </br>
     */
    List<Permission> getPermissionByUser(User user);
}
