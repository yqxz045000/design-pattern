package com.cfyj.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略设计模式测试案例
 * @author lius
 *
 */
public class Test {
	
	public static Map<String,String> transform_url_srategy_map = null;
	
	static {
		transform_url_srategy_map = new HashMap<String,String>();
		transform_url_srategy_map.put("tb", "com.cfyj.example.demo.strategy.impl.TBTransformURLSrategy");
		transform_url_srategy_map.put("jd", "com.cfyj.example.demo.strategy.impl.JDTransformURLSrategy");
		transform_url_srategy_map.put("pdd", "com.cfyj.example.demo.strategy.impl.PDDTransformURLSrategy");
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		String goodsUrl = "nanzhuang-01.com";
		
		getTransformURL(goodsUrl, "tb");
		getTransformURL(goodsUrl, "jd");
		getTransformURL(goodsUrl, "pdd");
		
	}
	
	
	private static  String getTransformURL(String goodsUrl,String goodsType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		String url = null;
		TransformURLSrategy srategy = (TransformURLSrategy) Class.forName(transform_url_srategy_map.get(goodsType)).newInstance();
		url = srategy.transformURL(goodsUrl);	
		return url ;
	}
	
	
	
}
