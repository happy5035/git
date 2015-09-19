package com.yuan.lee.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuan.lee.service.system.ValidateCode;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value="/tmd", method=RequestMethod.GET)
	public String dkfjslkfj() {
		return "system/userList";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String dologin(@RequestParam("username") String username,
			@RequestParam("password") String password, 
			@RequestParam("validateCode") String validateCode) {
		 
//		stu.setName(username);
//		stuM.insert(stu);
		return "redirect:/home";
	}
	@RequestMapping(value="/VerifyCode")
	public void validateCode(HttpServletRequest reqeust,  
            HttpServletResponse response){
		 try {
		// 设置响应的类型格式为图片格式  
        response.setContentType("image/jpeg");  
        //禁止图像缓存。  
        response.setHeader("Pragma", "no-cache");  
        response.setHeader("Cache-Control", "no-cache");  
        response.setDateHeader("Expires", 0);            
        HttpSession session = reqeust.getSession();            
        ValidateCode vCode = new ValidateCode(120,40,5,100);  
        session.setAttribute("code", vCode.getCode());        
		vCode.write(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
