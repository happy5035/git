package com.yuan.lee.dao;

import com.yuan.lee.common.BaseMapper;
import com.yuan.lee.common.MyBatisRepository;
import com.yuan.lee.entity.ClassTest;
@MyBatisRepository
public interface ClassTestMapper extends BaseMapper<ClassTest> {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassTest record);

    int insertSelective(ClassTest record);

    ClassTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassTest record);

    int updateByPrimaryKey(ClassTest record);
}