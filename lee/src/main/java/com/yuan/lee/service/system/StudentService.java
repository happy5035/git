package com.yuan.lee.service.system;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuan.lee.common.BaseService;
import com.yuan.lee.dao.StudentMapper;
import com.yuan.lee.entity.Student;
@Service
public class StudentService extends BaseService<Student> {
	@Autowired
	StudentMapper studentMapper;
	public int  deleteByParams(Map<String, Object> params)
	{
		return studentMapper.deleteByParams(params);
	}
}
