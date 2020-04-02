package com.ross.shiro;

import com.ross.pojo.Permission;
import com.ross.pojo.User;
import com.ross.service.ShiroService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zjf
 */
public class MyShiroReaml extends AuthorizingRealm {
    private Logger logger = Logger.getLogger(MyShiroReaml.class);

    @Autowired
    private ShiroService shiroService;

    public ShiroService getShiroService() {
        return shiroService;
    }

    @Autowired
    public void setShiroService(ShiroService shiroService) {
        this.shiroService = shiroService;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.debug("doGetAuthorizationInfo权限验证");
        /**
         *
         * 流程
         * 1.根据用户user->2.获取角色id->3.根据角色id获取权限permission
         */
        //方法一：获得user对象
        User user = (User) principalCollection.getPrimaryPrincipal();
        logger.debug("User:++++++++"+user);
        SimpleAuthorizationInfo   info = new SimpleAuthorizationInfo ();
        //获取permission
        if (user != null){
            List<Permission> permissionsByUser  = this.shiroService.getPermissionByUser(user);
            if (permissionsByUser.size() > 0){
                for (Permission p : permissionsByUser ) {
                    info.addStringPermission(p.getUrl());
                }
                return  info;
            }
        }

        return null;
    }

    /**
     * 认证方法
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.debug("doGetAuthenticationInfo----登录验证");
        //验证账号密码
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        logger.debug("1:"+token.getUsername());
        User user = this.shiroService.getUserByUserName(token.getUsername());
        logger.debug("2");
        if (user == null){
            return null;
        }

        //最后的比对需要交给安全管理器
        //三个参数进行初步的简单认证信息对象的包装
        AuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getSimpleName());
        logger.debug("info======="+info);

        return info;
    }
}
