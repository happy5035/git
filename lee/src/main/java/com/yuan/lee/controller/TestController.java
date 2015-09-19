package com.yuan.lee.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuan.lee.common.Page;
import com.yuan.lee.entity.Manager;
import com.yuan.lee.entity.Student;
import com.yuan.lee.entity.Test;
import com.yuan.lee.service.system.ClassService;
import com.yuan.lee.service.system.StudentService;
import com.yuan.lee.service.system.TestService;
import com.yuan.lee.util.Identities;

@RequestMapping(value="/newtest")
@Controller
public class TestController {

	Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	StudentService studentservice;
	@Autowired
	ClassService classService;
	@Autowired
	Student student;
	Integer id;
		@RequestMapping(value="/testtable",method=RequestMethod.GET)
		public  String table()
		{
			return "system/test";
		}
		@RequestMapping(value="/info")
		public String myinfo(){		
			return "/system/studentInfo";
		}
		@RequestMapping(value="/mytest",method=RequestMethod.POST)
		public String myTest(@RequestParam("username") String username,
							@RequestParam("email") String email,
							@RequestParam("birthday") String birthday,
							@RequestParam("url") String url,
							@RequestParam("phone") String phone)
		{
			return "ok";
		}
		@ResponseBody
		@RequestMapping(value="/list")
		public Map<String, Object> list(Page page){
			try {
				return studentservice.pagedByParams(page);
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			}
			
		}
		@ResponseBody
		@RequestMapping(value="/insert")
		public Map<String, Object> add(Student student){
			Map<String, Object> result = new HashMap<String, Object>();
			System.err.println("-------------\n"+student.toString());
			try {
//				manager.setManagerid(Identities.uuid2());
//				manager.setRegistertime(new Date());
//				managerService.insert(manager);	
				studentservice.insert(student);
				result.put("successMsg", "添加成功！");
			} catch (Exception e) {
				logger.error(e.getMessage());
				result.put("errorMsg", "出现错误，请联系管理员！");
			}
			return result;
		}
		@ResponseBody
		@RequestMapping(value="/update", method=RequestMethod.POST)
		public Map<String, Object> update(Student student){
			Map<String, Object> result = new HashMap<String, Object>();
			try {
				student.setId(this.id);
				System.out.println(student.toString());
				int row = studentservice.updateByPrimaryKey(student);
				if (row == 1) {
					result.put("successMsg", "修改成功！");
				}else {
					result.put("errorMsg", "出现错误，请联系管理员！");
				}			
			} catch (Exception e) {
				logger.error(e.getMessage());
				result.put("errorMsg", "出现错误，请联系管理员！");
			}
			return result;
		}
		@ResponseBody
		@RequestMapping(value="/{id}/edit")
		public Student edit(@PathVariable("id")Integer id){
			try {
				this.id=id;
				System.out.println("=-----------\n"+id);
			 	student = studentservice.selectByPrimaryKey(id);			
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
			return student;
		}
		@ResponseBody
		@RequestMapping(value="/{id}/delete")
		public Map<String, Object> delete(@PathVariable("id")Integer id){
			Map<String, Object> result = new HashMap<String, Object>();
			try {
			 	int row = studentservice.deleteByPrimaryKey(id);
			 	if (row == 1) {
					result.put("successMsg", "删除成功！");
				}else {
					result.put("errorMsg", "出现错误，请联系管理员！");
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
				result.put("errorMsg", "出现错误，请联系管理员！");
			}
			return result;
		}
		@ResponseBody
		@RequestMapping(value="/{id}/view")
		public Student view(@PathVariable("id")Integer id){
			try {
			 	student = studentservice.selectByPrimaryKey(id);			
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
			return student;
		}
}
