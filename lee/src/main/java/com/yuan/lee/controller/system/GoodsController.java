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
import com.yuan.lee.entity.Goods;
import com.yuan.lee.service.system.GoodsService;
import com.yuan.lee.util.Identities;
@Controller
@RequestMapping(value="/goods")
public class GoodsController {
	@Autowired
	GoodsService goodsService;
	@RequestMapping(value="", method = RequestMethod.GET)
	public String welcome(){
		return "welcome";
	}
	
    @ResponseBody
	@RequestMapping(value="/goodsList")
	public List<Goods> goodsList(ModelMap modelMap){	
    	List<Goods> goods=goodsService.selectAll();
		modelMap.addAttribute("goods", goods);
//		String s=null;
//		for(Student student:students){
//			s+=student.getName()+" "
//		}
		return goods; 
	}
	
	/*@RequestMapping(value="/register", method = RequestMethod.GET)
	public String userRegister(){		
		return "/system/userRegister";
	}*/
	
	@RequestMapping(value="/gshost",method=RequestMethod.GET)
	public String dataBaseManu(){
		//student.setID();
//		studentService.insert(student);
		return "goods";
	}
	@RequestMapping(value="/insertgoods",method=RequestMethod.POST)
	public String goodsAdd(Goods goods,ModelMap modelMap){
		goodsService.insert(goods);
		return "goods";
    }
	@RequestMapping(value="/deletegoods",method=RequestMethod.POST)
	public String goodsDel(Goods goods,ModelMap modelMap){
		goodsService.deleteByPrimaryKey(goods.getId());
        /*System.out.print("result:");
		System.out.print(result);*/
        return "goods";
	}
//	@ResponseBody
	@RequestMapping(value="/selectgoods",method=RequestMethod.POST)
	public String goodssel(Goods goods,ModelMap modelMap){
	    Goods result;
	    result=goodsService.selectByPrimaryKey(goods.getId());
	    modelMap.addAttribute("SelectedGoodsId", result.getId());
	    modelMap.addAttribute("SelectedGoodsName", result.getName());
	    modelMap.addAttribute("SelectedGoodsPrice", result.getPrice());
	    modelMap.addAttribute("SelectedGoodsCode", result.getCode());
		return "goodsSelect";
	}
	@RequestMapping(value="/updategoods",method=RequestMethod.POST)
	public String goodsupd(Goods goods,ModelMap modelMap){
		int result;
		result=goodsService.updateByPrimaryKey(goods);
		System.out.print(result);
		return "goods";
	}
}
