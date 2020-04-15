package com.cfyj.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 	维护动态线路信息模版方法设计模式：
 * 	1.获取当前线路信息，
 * 	2.解析线路信息--抽象，因为获取的渠道有多种
 * 	3.根据解析好的线路维护系统内部的动态线路表（当前站，下一站，当前行驶方向,当前时间）
 * 	4.将动态行驶线路持久化
 * 
 * @author lius
 *
 */
@Slf4j
public abstract class AbstractTemplateUpdateStationInfo {

	
	public void updateDynamicStationInfo() {
		log.info("维护静态线路信息");
		//普通方法：获取当前动态线路信息，抽象类有固定的获取方式，但也可以由子类提供获取方式
		String dynamicStationInfo = getDynamicStationInfo();
		//抽象方法：每个渠道的信息解析方式不同，由子类提供
		String afterResolvingStationInfo = ResolvingStationInfo(dynamicStationInfo);
		//固定方法：更新线路映射关系
		updateDynamicStationInfo(afterResolvingStationInfo);
		//固定方法：持久化线路映射关系
		PersistenceDynamicStationInfo();
	}

	
	
	private void PersistenceDynamicStationInfo() {
		log.info("持久化线路信息");		
	}

	private void updateDynamicStationInfo(String afterResolvingStationInfo) {
		log.info("更新线路信息：解析后的线路信息为：{}",afterResolvingStationInfo);
		
	}

	protected abstract String ResolvingStationInfo(String dynamicStationInfo);

	protected String getDynamicStationInfo() {
		log.info("获取动态线路信息");
		return "currentStation=人民广场&nextStation=浦东大道&currentTime=1558746765&direction=上行";
	}
	
}
