package com.wanggt.freedom.springcloud.study.login.controller;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 登录服务-Controller
 * @author freedom wang
 * @date 2018年3月29日下午8:23:45
 * @version 1.0
 */
@RestController
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("login/{name}")
	public LinkedHashMap<String, Object> login(@PathVariable("name") String name) {
		logger.info("Login#login is invoke");
		Object forObject = restTemplate.getForObject("http://127.0.0.1:8089/person/getPersons", Object.class);
		LinkedHashMap<String, Object> object = (LinkedHashMap<String, Object>) forObject;
		logger.info("Login#login is end");
		return object;
	}
}
