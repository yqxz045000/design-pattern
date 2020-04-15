package com.cfyj.design.pattern.strategy.impl;

import com.cfyj.design.pattern.strategy.TransformURLSrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 拼多多转链策略实现
 * @author lius
 *
 */
@Slf4j
public class PDDTransformURLSrategy implements TransformURLSrategy{
	
	@Override
	public String transformURL(String goodsUrl) {
		
		String transformgoodsUrl = "pdd."+goodsUrl;
		log.info("将URL转为拼多多平台链接,转换前:{},转换后:{}",goodsUrl,transformgoodsUrl);
		return transformgoodsUrl;
	}
	
}
