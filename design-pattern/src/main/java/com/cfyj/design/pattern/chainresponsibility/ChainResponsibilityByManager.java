package com.cfyj.design.pattern.chainresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * 招商经理
 * @author lius
 *
 */
@Slf4j
public class ChainResponsibilityByManager extends AbstractChainResponsibility{
	

	
	public ChainResponsibilityByManager(AbstractChainResponsibility next, String name) {
		super(next, name, 100);
	}

	@Override
	public void exec(double money) {
		log.info("达成合作，这笔单子处理完了。我能处理的金额:{},目前单子金额:{}",this.getResponsibility_money(),money);
	}
}
