package com.yuan.lee.service.system;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuan.lee.common.BaseService;
import com.yuan.lee.dao.ClassTestMapper;
import com.yuan.lee.entity.ClassTest;

@Service
public class ClassService  extends BaseService<ClassTest>{
	@Autowired
	ClassTestMapper classmapper;
    public int  deleteByParams(Map<String, Object> params){
    	
    	return classmapper.deleteByParams(params);
    }
}
