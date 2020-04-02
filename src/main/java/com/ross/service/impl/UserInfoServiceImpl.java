package com.ross.service.impl;

import com.ross.common.AppResult;
import com.ross.dao.UserInfoMapper;
import com.ross.pojo.UserExample;
import com.ross.pojo.UserInfo;
import com.ross.pojo.UserInfoExample;
import com.ross.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zjf
 * @version 1.0.1
 */
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public AppResult getUserInfoAll() {
        AppResult result = new AppResult();
        UserInfoExample example = new UserInfoExample();
        List<UserInfo> list = this.userInfoMapper.selectByExample(example);
        if (list.size()>0){
            result.setCode(200);
            result.setData(list);
            result.setMsg("查询成功！");
            return result;
        }
        result.setCode(200);
        result.setData(list);
        result.setMsg("没有查询到数据！");
        return result;
    }
}
