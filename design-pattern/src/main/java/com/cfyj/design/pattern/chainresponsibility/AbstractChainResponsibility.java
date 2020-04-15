package com.cfyj.design.pattern.chainresponsibility;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 抽象责任链设计模式（与模版模式联用）: 有层级关系、他们都是为了解决同一类问题，但责任链更倾向于曾计划，当自身无法处理时交由上一层处理。有点类似反向
 * 的双亲委派机制，先交由父类处理，若父类不处理则子类再处理。
 * 
 * 场景：比如招商的场景，首先客户打电话招商部门，A招商专员只能处理10w以下的，B是A上级招商经理可处理100w以下，
 * C是B上级可处理1000w以下的，不同的投资额度对应不同的处理人
 * 
 * @author lius
 *
 */
@Slf4j
@Data
public abstract class AbstractChainResponsibility {

	/**
	 * 1.固定的判断级别的方案，可以对外暴漏 2.固定的处理流程 3.非固定的处理方案
	 */

	private AbstractChainResponsibility next;
	
	private String name = "" ;

	private double responsibility_money = 0;

	/**
	 * 钩子方法：是否自身可以处理，可被子类覆盖
	 */
	public boolean isResponsibility(double money) {
		if (money < responsibility_money) {
			return true;
		}
		return false;
	}
	
	/**
	 * 抽象方法，由子类填充实现
	 * @param money
	 */
	public abstract void exec(double money);
	
	/**
	 * 执行流程
	 * @param money
	 */
	public final void handler(double money) {

		if (isResponsibility(money)) {
			log.info("我是:{},可以当前业务，准备处理-----",name);
			exec(money);
		}else {
			if(next!=null) {
				log.info("我是:{},处理不了，交给上级处理:{}",name ,next.name);
				next.handler(money);
			}else {
				log.info("单子太大了，{}也处理不了，要不然你收购我们吧",name);
			}		
		}
	}

	public AbstractChainResponsibility(AbstractChainResponsibility next, String name, double responsibility_money) {
		super();
		this.next = next;
		this.name = name;
		this.responsibility_money = responsibility_money;
	}


	public AbstractChainResponsibility() {
		super();
	}

}
