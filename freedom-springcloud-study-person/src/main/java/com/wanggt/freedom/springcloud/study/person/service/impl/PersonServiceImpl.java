package com.wanggt.freedom.springcloud.study.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.wanggt.freedom.springcloud.study.person.dao.PersonDao;
import com.wanggt.freedom.springcloud.study.person.entity.PersonBean;
import com.wanggt.freedom.springcloud.study.person.service.PersonService;

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
	public PageInfo<PersonBean> getPersons(PersonBean bean) {
		Page<PersonBean> persons = personDao.getPersons(bean);
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
