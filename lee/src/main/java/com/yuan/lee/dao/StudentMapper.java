package com.yuan.lee.dao;

import java.util.Map;

import com.yuan.lee.common.BaseMapper;
import com.yuan.lee.common.MyBatisRepository;
import com.yuan.lee.entity.Student;
@MyBatisRepository
public interface StudentMapper extends BaseMapper<Student>{
	public int  deleteByParams(Map<String, Object> params);
}