package org.code0.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**  
 * @Title: RedirectController.java
 * @Package org.code0.springmvc.controller
 * @Description: 重定向 controller Demo
 * @author Code0   
 * @date 2017年9月6日 下午10:22:01 
 */
@Controller
public class RedirectController {

	@RequestMapping("/testRedirect")
	public String testRedirect(Model model){
		
		return "redirect:/hello";
	}
}
