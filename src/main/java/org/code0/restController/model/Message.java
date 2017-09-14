package org.code0.restController.model;

import javax.xml.bind.annotation.XmlRootElement;
/**  
 * @Title: Message.java
 * @Package org.code0.restController.model
 * @Description: Message.java
 * @author Code0   
 * @date 2017年9月14日 上午11:15:16 
 */
@XmlRootElement//该注解设置请求返回xml
public class Message {

	private String name;
	
	private String text;

	/** @return name */
	public String getName() {
		return name;
	}

	/** @param name 要设置的 name */
	public void setName(String name) {
		this.name = name;
	}

	/** @return text */
	public String getText() {
		return text;
	}

	/** @param text 要设置的 text */
	public void setText(String text) {
		this.text = text;
	}
}
