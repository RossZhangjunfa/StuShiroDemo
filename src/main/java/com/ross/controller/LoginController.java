package com.ross.controller;

import com.ross.pojo.User;
import com.ross.service.ShiroService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * @author  zjf
 */
@Controller
//@RequestMapping("/user")
public class LoginController {
    private Logger logger = Logger.getLogger(LoginController.class);
    @Autowired
    private ShiroService shiroService;

    public ShiroService getShiroService() {
        return shiroService;
    }

    @Autowired
    public void setShiroService(ShiroService shiroService) {
        this.shiroService = shiroService;
    }

    /**
     * 验证登录
     * @param userName
     * @param passWord
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "/login.do")
    public String Login(String userName, String passWord, HttpSession session, Model model){
        System.out.println("userName:"+userName);
        if (userName == null){
            model.addAttribute("msg", "账号不能为空！");
            return  "login";
        }
        //主体,当前状态为没有认证的状态“未认证”
        Subject subject = SecurityUtils.getSubject();
        //登录后放进shiro 的 token 中
        UsernamePasswordToken token = new UsernamePasswordToken(userName,passWord);
        User user;
        //登录方法
        //使用subject 调用securityManager，安全管理器调用Realm
        try {
            //利用异常操作
            //需要开始调用Realm
            logger.debug("=========================");
            logger.debug("-------1、认证方法开始进入-------------------");
            subject.login(token);
            user = (User) subject.getPrincipal();
            session.setAttribute("user",subject);
            model.addAttribute("msg", "登录成功！");
            logger.debug("登录成功！");

        }catch (UnknownAccountException e){
            model.addAttribute("msg", "账号密码不正确！");
            return "index";
        }
        return  "test";
    }

    @RequestMapping("/check.do")
    public String check(HttpSession session){
        Subject subject=(Subject)session.getAttribute("user");
        User user=(User)subject.getPrincipal();
        logger.debug(user.toString());
        return "permission";
    }

    @RequestMapping("/readName.do")
    public String readName(HttpSession session){

        return "name";
    }

    @RequestMapping(value = "/readData.do")
    public String readData(HttpSession session){

        return "data";
    }

    @RequestMapping(value = "/noPermission.do")
    public String noPermission(){
        return "error";
    }

}
