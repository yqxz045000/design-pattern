package com.cfyj.design.pattern.chainresponsibility;

public class ChainResponsibilityTest {
	
	public static void main(String[] args) {
		/**
		 *  场景：比如招商的场景，首先客户打电话招商部门，A招商专员只能处理10w以下的，B是A上级招商经理可处理100w以下，
		 * C是B上级可处理1000w以下的，不同的投资额度对应不同的处理人
		 */
		
		ChainResponsibilityByCEO ceo = new ChainResponsibilityByCEO(null,"ceo");
		ChainResponsibilityByManager manager = new ChainResponsibilityByManager(ceo,"招商经理");
		ChainResponsibilityByCommissioner com = new ChainResponsibilityByCommissioner(manager,"招商专员");
		
		//客户要处理200的单子
		com.handler(6);
		com.handler(80);
		com.handler(200);		
	}
}
