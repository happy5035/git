package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AccountPerm implements Serializable {
    private String accountpermid;

    private String accountid;

    private String permissionsid;

    private String type;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getAccountpermid() {
        return accountpermid;
    }

    public void setAccountpermid(String accountpermid) {
        this.accountpermid = accountpermid == null ? null : accountpermid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getPermissionsid() {
        return permissionsid;
    }

    public void setPermissionsid(String permissionsid) {
        this.permissionsid = permissionsid == null ? null : permissionsid.trim();
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