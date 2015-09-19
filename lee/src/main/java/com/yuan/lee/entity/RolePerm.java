package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class RolePerm implements Serializable {
    private String rolepermid;

    private String permissionsid;

    private String roleid;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getRolepermid() {
        return rolepermid;
    }

    public void setRolepermid(String rolepermid) {
        this.rolepermid = rolepermid == null ? null : rolepermid.trim();
    }

    public String getPermissionsid() {
        return permissionsid;
    }

    public void setPermissionsid(String permissionsid) {
        this.permissionsid = permissionsid == null ? null : permissionsid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}