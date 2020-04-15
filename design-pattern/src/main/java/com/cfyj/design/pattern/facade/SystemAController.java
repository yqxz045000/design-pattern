package com.cfyj.design.pattern.facade;

/**
 * 
 * 具体提供服务的子系统
 * 
 * @author chenfeng
 *
 */
public class SystemAController {

	/**
	 * 获取个人信息，可供客户端调用
	 */
	public String getPersonInfo() {

		return "男、22岁、";
	}

	/**
	 * 获取密码，只能被内部服务调用
	 * 
	 * @return
	 */
	public String getPassword() {
		return "123432";
	}

}
