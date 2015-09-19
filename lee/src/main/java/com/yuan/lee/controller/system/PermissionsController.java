package com.yuan.lee.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/perm")
public class PermissionsController {
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String userRegister(){
		
		return "/system/userList";
	}
}
