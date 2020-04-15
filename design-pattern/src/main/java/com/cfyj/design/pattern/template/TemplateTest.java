package com.cfyj.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplateTest {

	public static void main(String[] args) {

		AbstractTemplateUpdateStationInfo templateByTerminal = new TemplateUpdateStationInfoByTerminal();
		templateByTerminal.updateDynamicStationInfo();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		TemplateUpdateStationInfoByBoWen templateByBoWen = new TemplateUpdateStationInfoByBoWen();
		templateByBoWen.updateDynamicStationInfo();

	}

}
