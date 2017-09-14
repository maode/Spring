package org.code0.restController.controller;

import org.code0.restController.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**  
 * @Title: TestRestController.java
 * @Package org.code0.restController.controller
 * @Description: TestRestController.java
 * @author Code0   
 * @date 2017年9月14日 上午11:13:59 
 */
@RestController
public class TestRestController {

	@RequestMapping("/testRestController/{text}")
	@ResponseBody
	public  Message message(@PathVariable String text){
		
		Message msg=new Message();
		msg.setName("jhon");
		msg.setText(text);
		return msg;
	}
}
