package com.ross.dao;

import com.ross.pojo.Permission;
import com.ross.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zjf
 */
@Component
public interface ShiroDao {
    /**
     * 根据账户获取该账号对应的实体类
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);

    /**
     * 根据角色Id获取该账号的权限
     * @param roleId
     * @return
     */
    List<Permission> getPermissionByRoleId(int roleId);

    /**
     * 根据userId获取角色id
     * @param userId
     * @return
     */
    List<Integer> getUserRoleByUserId(int userId);
}
