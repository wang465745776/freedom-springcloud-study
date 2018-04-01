package com.wanggt.freedom.springcloud.study.person.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.wanggt.freedom.springcloud.study.person.entity.PersonBean;
import com.wanggt.freedom.springcloud.study.person.service.PersonService;
import com.wanggt.freedom.springcloud.study.person.util.Result;

/**
 * 人员管理-Controller
 * @author freedom wang
 * @date 2018年3月28日上午10:41:21
 * @version 1.0
 */
@RestController
@RequestMapping("/person")
public class PersonController {
	private Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;

	@GetMapping("getPersons")
	public Result getPersons() {
		logger.info("PersonController#getPersons is invoke");
		PageInfo<PersonBean> persons = personService.getPersons();
		return Result.success().result(persons);
	}
}
