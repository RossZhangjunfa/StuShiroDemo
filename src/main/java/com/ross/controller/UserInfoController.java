package com.ross.controller;

import com.ross.common.AppResult;
import com.ross.service.UserInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjf
 * @version  1.0.1
 */
@Controller
@RequestMapping("/app")
public class UserInfoController {
    private Logger logger = Logger.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public UserInfoService getUserInfoService() {
        return userInfoService;
    }

    public AppResult getUserInfo(){
        return null;
    }
}
