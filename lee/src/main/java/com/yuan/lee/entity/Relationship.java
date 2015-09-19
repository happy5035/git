package com.yuan.lee.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Relationship implements Serializable {
    private Integer relationid;

    private Integer person1;

    private Integer person2;

    private Integer level;

    private static final long serialVersionUID = 1L;

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Integer getPerson1() {
        return person1;
    }

    public void setPerson1(Integer person1) {
        this.person1 = person1;
    }

    public Integer getPerson2() {
        return person2;
    }

    public void setPerson2(Integer person2) {
        this.person2 = person2;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}