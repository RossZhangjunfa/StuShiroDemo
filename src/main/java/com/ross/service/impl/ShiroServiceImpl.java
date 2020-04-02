package com.ross.service.impl;

import com.ross.dao.ShiroDao;
import com.ross.pojo.Permission;
import com.ross.pojo.User;
import com.ross.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjf
 */
public class ShiroServiceImpl implements ShiroService {
    @Autowired
    private ShiroDao shiroDao;
    @Override
    public User getUserByUserName(String userName) {
        //根据账号获取密码
        User userByUserName = this.shiroDao.getUserByUserName(userName);
        return userByUserName;
    }

    @Override
    public List<Permission> getPermissionByUser(User user) {
        //获取到用户角色UserRole
        List<Integer> roleId = this.shiroDao.getUserRoleByUserId(user.getId());
        List<Permission> permissionsArray = new ArrayList<>();
        if (roleId != null && roleId.size() > 0){
            //根据roleId获取permission
            for (Integer i:roleId) {
                permissionsArray.addAll(this.shiroDao.getPermissionByRoleId(i));
            }
        }
        System.out.println("权限集合："+permissionsArray);
        return permissionsArray;
    }
}
