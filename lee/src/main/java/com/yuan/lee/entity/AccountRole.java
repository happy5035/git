package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AccountRole implements Serializable {
    private String accountroleid;

    private String roleid;

    private String accountid;

    private String type;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getAccountroleid() {
        return accountroleid;
    }

    public void setAccountroleid(String accountroleid) {
        this.accountroleid = accountroleid == null ? null : accountroleid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}