package syblog.user.bean;

import java.util.Date;

/**
 * 用户信息
 *
 * @author kibersy
 * @date 2019/3/9 17:31
 */

public class UserBean {

    // 用户编号
    private String id;
    // 用户名
    private String userName;
    // 登陆密码
    private String password;
    // 邮箱
    private String email;
    // 电话
    private String telphone;
    // 注册时间
    private Date creaTime;
    // 修改时间
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Date getCreaTime() {
        return creaTime;
    }

    public void setCreaTime(Date creaTime) {
        this.creaTime = creaTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
