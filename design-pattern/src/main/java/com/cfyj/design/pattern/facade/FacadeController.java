package com.cfyj.design.pattern.facade;

/**
 * 门面层，负责鉴权、统计、开放服务
 * 
 * @author chenfeng
 *
 */
public class FacadeController {

	private SystemAController systemAController = new SystemAController();
	
	public String getPersonInfo() {

		return systemAController.getPersonInfo();
	}

}
