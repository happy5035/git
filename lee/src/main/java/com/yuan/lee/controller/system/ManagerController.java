package com.yuan.lee.controller.system;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuan.lee.common.Page;
import com.yuan.lee.entity.Manager;
import com.yuan.lee.service.system.ManagerService;
import com.yuan.lee.util.Identities;


@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	Logger logger = LoggerFactory.getLogger(ManagerController.class);
	@Autowired
	ManagerService managerService;
	
	@Autowired
	Manager manager;
	
	@RequestMapping(value="")
	public String userList(){
		return "system/managerList";
	}
	
	@ResponseBody
	@RequestMapping(value="/list")
	public Map<String, Object> list(Page page){
		try {
			return managerService.pagedByParams(page);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
		
	}
	
	@RequestMapping(value="/info")
	public String info(){		
		return "/system/managerInfo";
	}
	
	@ResponseBody
	@RequestMapping(value="/insert")
	public Map<String, Object> add(Manager manager){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			manager.setManagerid(Identities.uuid2());
			manager.setRegistertime(new Date());
//			managerService.insert(manager);			
			result.put("successMsg", "添加成功！");
		} catch (Exception e) {
			logger.error(e.getMessage());
			result.put("errorMsg", "出现错误，请联系管理员！");
		}
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/{managerid}/edit")
	public Manager edit(@PathVariable("managerid")String managerid){
		try {
		 	manager = managerService.selectByPrimaryKey(managerid);			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return manager;
	}
	
	@ResponseBody
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public Map<String, Object> update(Manager manager){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			int row = managerService.updateByPrimaryKey(manager);
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
	@RequestMapping(value="/{managerid}/view")
	public Manager view(@PathVariable("managerid")String managerid){
		try {
		 	manager = managerService.selectByPrimaryKey(managerid);			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return manager;
	}
	
	@ResponseBody
	@RequestMapping(value="/{managerid}/delete")
	public Map<String, Object> delete(@PathVariable("managerid")String managerid){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
		 	int row = managerService.deleteByPrimaryKey(managerid);
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
	@RequestMapping(value="/isInexistent")
	public boolean isInexistent(String loginname, String managerid){
		try {
		 	return managerService.isInexistent("loginname", loginname, "managerid", managerid);	 	
		} catch (Exception e) {
			logger.error(e.getMessage());
			return false;
		}
	}
}


