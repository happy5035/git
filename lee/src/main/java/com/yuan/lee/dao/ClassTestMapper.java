package com.yuan.lee.dao;

import java.util.Map;

import com.yuan.lee.common.BaseMapper;
import com.yuan.lee.common.MyBatisRepository;
import com.yuan.lee.entity.ClassTest;
@MyBatisRepository
public interface ClassTestMapper extends BaseMapper<ClassTest> {

    public int  deleteByParams(Map<String, Object> params);

}