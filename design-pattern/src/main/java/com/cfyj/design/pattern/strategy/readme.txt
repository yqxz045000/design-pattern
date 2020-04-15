策略设计模式案例：
	场景：在返利商城中，需要将访问的商品链接转为附带本平台信息的商品链接，而针对于不同的商品归于如淘宝、京东、拼多多转链的方式也不同，
而且要留有扩展的余地，方便后续添加新的转链方式。
	设计：
		抽象接口 TransformURLsSrategy，提供transformURL(String goodsUrl):
		实现： TBTransformURLsSrategy 、JDTransformURLsSrategy、PDDTransformURLsSrategy 各自实现TransformURLsSrategy，完善自己的转链功能。