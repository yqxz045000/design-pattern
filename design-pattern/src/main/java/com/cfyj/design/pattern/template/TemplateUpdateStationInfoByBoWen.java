package com.cfyj.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 从博文端获取线路信息
 * 
 * @author lius
 *
 */
@Slf4j
public class TemplateUpdateStationInfoByBoWen extends AbstractTemplateUpdateStationInfo {
	
	@Override
	protected String ResolvingStationInfo(String dynamicStationInfo) {
		log.info("从博文端获取的线路数据，解析数据------");
		return dynamicStationInfo;
	}

}
