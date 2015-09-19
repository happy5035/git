package com.yuan.lee.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuan.lee.common.BaseService;
import com.yuan.lee.common.Page;
import com.yuan.lee.entity.Role;
import com.yuan.lee.entity.User;
import com.yuan.lee.service.system.RolesService;
import com.yuan.lee.service.system.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	UserService userService;

	@Autowired
	RolesService rolesService;
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	 
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {	
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		Map<String, Object> params = new HashMap<String, Object>();
		List<User> users = userService.findByParams(params);
		for (User user1 : users) {
			System.out.println("userList:find(params):"+ user1.getLoginname());
		}
			
		model.addAttribute("serverTime", formattedDate );
		return "welcome";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		
		return "home";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test( ModelMap model) {
//	System.out.println("------\n----");
		model.put("message", 23);
		return "test";
	}
	
}
