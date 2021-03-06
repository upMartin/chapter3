package com.smart.domain;

import java.util.Date;

public class LoginLog {
    private int loginLoginId;
    private int userId;
    private String ip;
    private Date loginDate;

    public int getLoginLoginId() {
        return loginLoginId;
    }

    public void setLoginLoginId(int loginLoginId) {
        this.loginLoginId = loginLoginId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
