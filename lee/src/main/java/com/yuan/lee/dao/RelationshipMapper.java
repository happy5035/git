package com.yuan.lee.dao;

import com.yuan.lee.common.MyBatisRepository;
import com.yuan.lee.entity.Relationship;
@MyBatisRepository
public interface RelationshipMapper {
    int deleteByPrimaryKey(Integer relationid);

    int insert(Relationship record);

    int insertSelective(Relationship record);

    Relationship selectByPrimaryKey(Integer relationid);

    int updateByPrimaryKeySelective(Relationship record);

    int updateByPrimaryKey(Relationship record);
}