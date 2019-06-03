package com.learningcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alibaba.dubbo.config.annotation.Reference;
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
@Controller
public class SomeController {

	@Autowired
	private SomeService someService;


	@GetMapping("/home")
	public String home(Model model){
		String result = someService.sayHello("Dubbo");
		model.addAttribute("msg",result);
		return "msg";
	}
}
