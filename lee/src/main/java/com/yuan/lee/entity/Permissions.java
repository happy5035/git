package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Permissions implements Serializable {
    private String permissionsid;

    private String parentid;

    private String title;

    private String name;

    private String url;

    private Integer ordernum;

    private String icncls;

    private String notes;

    private String type;

    private String state;

    private static final long serialVersionUID = 1L;

    public String getPermissionsid() {
        return permissionsid;
    }

    public void setPermissionsid(String permissionsid) {
        this.permissionsid = permissionsid == null ? null : permissionsid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getIcncls() {
        return icncls;
    }

    public void setIcncls(String icncls) {
        this.icncls = icncls == null ? null : icncls.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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