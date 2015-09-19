package com.yuan.lee.controller.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuan.lee.common.Page;
import com.yuan.lee.entity.User;
import com.yuan.lee.service.system.UserService;
import com.yuan.lee.util.Identities;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String userList(){
		return "system/userList";
	}
	
	@ResponseBody
	@RequestMapping(value="/userList")
	public Map<String, Object> userListJson(Page dataGridParams){	
		
		return userService.pagedByParams(dataGridParams);
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String userRegister(){		
		return "/system/userRegister";
	}
	
	@RequestMapping(value="/add")
	public String userAdd(User user, ModelMap modelMap){
		user.setUserid(Identities.uuid2());
		userService.insert(user);
		return "ok";
	}
}
