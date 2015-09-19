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
import com.yuan.lee.dao.RelationshipMapper;
import com.yuan.lee.entity.Relationship;
import com.yuan.lee.entity.Type;
import com.yuan.lee.service.system.TypeService;
import com.yuan.lee.util.Identities;
@Controller
@RequestMapping(value="/type")
public class TypeController {
	@Autowired
	TypeService typeService;
	@RequestMapping(value="", method = RequestMethod.GET)
	public String welcome(){
		return "welcome";
	}
	
    @ResponseBody
	@RequestMapping(value="/typeList")
	public List<Type> TypeList(ModelMap modelMap){	
    	List<Type> type=typeService.selectAll();
		modelMap.addAttribute("type", type);
//		String s=null;
//		for(Student student:students){
//			s+=student.getName()+" "
//		}
		return type; 
	}
	
	/*@RequestMapping(value="/register", method = RequestMethod.GET)
	public String userRegister(){		
		return "/system/userRegister";
	}*/
	
	@RequestMapping(value="/thost",method=RequestMethod.GET)
	public String dataBaseManu(){
		//student.setID();
//		studentService.insert(student);
		return "type";
	}
	@RequestMapping(value="/inserttype",method=RequestMethod.POST)
	public String typeAdd(Type type,ModelMap modelMap){
		typeService.insert(type);
		return "type";
    }
	@RequestMapping(value="/deletetype",method=RequestMethod.POST)
	public String typeDel(Type type,ModelMap modelMap){
	    typeService.deleteByPrimaryKey(type.getCode());
        /*System.out.print("result:");
		System.out.print(result);*/
        return "type";
	}
//	@ResponseBody
	@RequestMapping(value="/selecttype",method=RequestMethod.POST)
	public String typesel(Type type ,ModelMap modelMap){
	    Type result;
	    result=typeService.selectByPrimaryKey(type.getCode());
	    modelMap.addAttribute("SelectedTypeCode", result.getCode());
	    modelMap.addAttribute("SelectedTypeName", result.getName());
		return "typeSelect";
	}
	@RequestMapping(value="/updatetype",method=RequestMethod.POST)
	public String typeupd(Type type,ModelMap modelMap){
		int result;
		result=typeService.updateByPrimaryKey(type);
//		System.out.print(result);
		return "type";
	}
}
