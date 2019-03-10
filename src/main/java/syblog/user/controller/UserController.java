package syblog.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import syblog.user.bean.UserBean;
import syblog.util.DateUtil;

/**
 * @author kibersy
 * @date 2019/3/9 18:12
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public UserBean getUser(){
        UserBean user = new UserBean();
        user.setId("user_00000001");
        user.setUserName("kibersy");
        user.setPassword("King823118125.");
        user.setTelphone("18581561603");
        user.setEmail("823118125@qq.com");
        user.setCreaTime(DateUtil.getSystemTime());
        user.setUpdateTime(DateUtil.getSystemTime());
        return user;
    }
}
