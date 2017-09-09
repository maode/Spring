package org.code0.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**  
 * @Title: RequestParamController.java
 * @Package org.code0.springmvc.controller
 * @Description: RequestParam Demo
 * @author Code0   
 * @date 2017年9月7日 上午11:19:55 
 */
@Controller
public class RequestParamController {
	
	@RequestMapping("testRP")
	public String testRequestParam(Model model,@RequestParam(value="name",defaultValue="Guest") String name){
		
		model.addAttribute("name", name);
		if("admin".equals(name)){
			model.addAttribute("email", "admin@code0.org");
		}else{
			model.addAttribute("email","No set!!!");
		}
		return "testRequestParam";
	}

}
