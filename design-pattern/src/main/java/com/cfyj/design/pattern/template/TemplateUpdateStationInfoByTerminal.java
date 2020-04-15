package com.cfyj.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 从终端获取到线路信息，解析这类数据进行
 * @author lius
 *
 */
@Slf4j
public class TemplateUpdateStationInfoByTerminal extends AbstractTemplateUpdateStationInfo{

	@Override
	protected String ResolvingStationInfo(String dynamicStationInfo) {
		log.info("从终端获取的线路数据，解析数据------");
		return dynamicStationInfo;
	}

}
