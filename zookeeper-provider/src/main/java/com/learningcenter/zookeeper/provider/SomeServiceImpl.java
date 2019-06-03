package com.learningcenter.zookeeper.provider;

import com.learningcenter.api.SomeService;

/**
 * <pre>
 * @author Jason
 *
 * @version 0.9
 *
 * 修改版本: 0.9
 * 修改日期: 2019-06-03
 * 修改人 : Jason
 * 修改说明:
 * 复审人 ：
 * </pre>
 **/
public class SomeServiceImpl implements SomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("Dubbo world welcome you,"+name);
		return "hello"+name;
	}
}
