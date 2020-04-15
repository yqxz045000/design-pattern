package com.cfyj.design.pattern.strategy.impl;

import com.cfyj.design.pattern.strategy.TransformURLSrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 淘宝转链策略实现
 * @author lius
 *
 */
@Slf4j
public class TBTransformURLSrategy implements TransformURLSrategy{

	
	@Override
	public String transformURL(String goodsUrl) {
		
		String transformgoodsUrl = "tb."+goodsUrl;
		log.info("将URL转为淘宝平台链接,转换前:{},转换后:{}",goodsUrl,transformgoodsUrl);
		return transformgoodsUrl;
	}

}
