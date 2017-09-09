package org.code0.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**  
 * @Title: HelloWorld.java
 * @Package org.code0.springmvc.controller
 * @Description: Hello World
 * @author Code0   
 * @date 2017年9月6日 下午4:01:41 
 */
@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	public String hello(Model model){
		
		model.addAttribute("greeting", "SpringMVC---Hello World");
		
		return "helloworld";
	}
}
