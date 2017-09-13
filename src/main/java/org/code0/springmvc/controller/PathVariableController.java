package org.code0.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**  
 * @Title: PathVariableController.java
 * @Package org.code0.springmvc.controller
 * @Description: PathVariable Demo <br/>
 * 使用@PathVariable注释将一个方法参数绑定到一个URI模板变量的值
 * @author Code0   
 * @date 2017年9月7日 下午12:06:01 
 */
@Controller
public class PathVariableController {
	/*
	
	Test link:
	http://localhost:8080/web/fe/来搞啊/zh_cn/document/666/搞什么
	http://localhost:8080/web/fe/来搞啊/zh_cn/document/888/搞什么
	
	 */		
	@RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
	public String testPathVariable(Model model,
			@PathVariable(value="sitePrefix") String sitePrefix,
			@PathVariable(value="language") String language,
			@PathVariable(value="id") String id,
			@PathVariable(value="naturalText") String naturalText
			){
		model.addAttribute("sitePrefix", sitePrefix);
		model.addAttribute("language", language);
		model.addAttribute("id", id);
		model.addAttribute("naturalText", naturalText);
		
		String documentName = "Doc A";
		if (id == "666") {
			documentName = "Doc 6666";
		}

		model.addAttribute("documentName", documentName);

	return "testPathVariable";
	}
}
