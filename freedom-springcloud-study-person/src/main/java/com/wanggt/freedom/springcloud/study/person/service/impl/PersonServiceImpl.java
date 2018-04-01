package com.wanggt.freedom.springcloud.study.person.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.wanggt.freedom.springcloud.study.person.dao.PersonDao;
import com.wanggt.freedom.springcloud.study.person.entity.PersonBean;
import com.wanggt.freedom.springcloud.study.person.service.PersonService;
import com.wanggt.freedom.springcloud.study.person.util.json.JSONUtil;

/**
 * 人员管理-ServiceImpl
 * @author freedom wang
 * @date 2017年08月09日09时13分
 * @since 1.0
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;

	@Override
	public PageInfo<PersonBean> getPersons() {
		PersonBean person = JSONUtil.parse(
				"{\"iid\":24,\"kid\":\"17062009-0211-4782-CDE4-43C60B054CCC\",\"name\":\"王贵堂\",\"account\":\"测试新增\",\"password\":\"123456\",\"sex\":\"女\",\"identitycard\":\"\",\"email\":\"\",\"phone\":\"18825159752\",\"birthday\":\"2017-06-05\",\"activationValue\":0,\"isAdmin\":0}",
				PersonBean.class);

		List<PersonBean> persons = new ArrayList<>();
		persons.add(person);
		return new PageInfo<PersonBean>(persons);
	}

	@Override
	public PersonBean getPersonByKid(PersonBean bean) {
		return personDao.getPersonByKid(bean);
	}

	@Transactional
	@Override
	public PersonBean addPerson(PersonBean bean) {
		int status = personDao.addPerson(bean);

		if (status == 1) {
			PersonBean personBean = personDao.getPersonByKid(bean);
			return personBean;
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public PersonBean updatePerson(PersonBean bean) {
		int status = personDao.updatePerson(bean);

		if (status == 1) {
			PersonBean personBean = personDao.getPersonByKid(bean);
			return personBean;
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public PersonBean deletePerson(PersonBean bean) {
		int status = personDao.deletePerson(bean);

		if (status == 1) {
			PersonBean personBean = personDao.getPersonByKid(bean);
			return personBean;
		} else {
			return null;
		}
	}
}
