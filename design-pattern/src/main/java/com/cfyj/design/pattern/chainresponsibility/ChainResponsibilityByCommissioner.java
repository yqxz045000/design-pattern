package com.cfyj.design.pattern.chainresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * 招商专员
 * @author lius
 *
 */
@Slf4j
public class ChainResponsibilityByCommissioner extends AbstractChainResponsibility{
	
	
	
	public ChainResponsibilityByCommissioner(AbstractChainResponsibility next, String name) {
		super(next, name, 10);
	}

	@Override
	public void exec(double money) {
		log.info("达成合作，这笔单子处理完了。我能处理的金额:{},目前单子金额:{}",this.getResponsibility_money(),money);
	}

}
