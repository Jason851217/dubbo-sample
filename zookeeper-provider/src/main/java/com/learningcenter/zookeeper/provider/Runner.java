package com.learningcenter.zookeeper.provider;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
public class Runner {
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-zookeeper-dubbo-provider.xml");
		((ClassPathXmlApplicationContext) context).start();
		//阻塞，目的是为了保证spring容器不被销毁
		System.in.read();
	}
}
