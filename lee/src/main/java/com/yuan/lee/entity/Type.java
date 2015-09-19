package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Type implements Serializable {
    private Integer code;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}