package com.cfyj.design.pattern.strategy.impl;

import com.cfyj.design.pattern.strategy.TransformURLSrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 京东转链策略实现
 * @author lius
 *
 */
@Slf4j
public class JDTransformURLSrategy implements TransformURLSrategy{

	@Override
	public String transformURL(String goodsUrl) {
		
		String transformgoodsUrl = "jd."+goodsUrl;
		log.info("将URL转为京东平台链接,转换前:{},转换后:{}",goodsUrl,transformgoodsUrl);
		return transformgoodsUrl;
	}
}
