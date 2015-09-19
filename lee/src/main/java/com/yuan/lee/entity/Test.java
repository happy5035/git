package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Test implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
}