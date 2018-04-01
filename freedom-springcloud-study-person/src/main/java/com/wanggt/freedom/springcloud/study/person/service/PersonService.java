package com.wanggt.freedom.springcloud.study.person.service;

import com.github.pagehelper.PageInfo;
import com.wanggt.freedom.springcloud.study.person.entity.PersonBean;

/**
 * 人员管理-Service
 * @author freedom wang
 * @date 2017年08月09日09时13分
 * @since 1.0
 */
public interface PersonService {

	/**
	 * 人员管理-查询人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public PageInfo<PersonBean> getPersons();

	/**
	 * 人员管理-根据kid查询人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年11月10日上午12:52:44
	 * @since 1.0
	 */
	public PersonBean getPersonByKid(PersonBean bean);

	/**
	 * 人员管理-新增人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public PersonBean addPerson(PersonBean bean);

	/**
	 * 人员管理-修改人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public PersonBean updatePerson(PersonBean bean);

	/**
	 * 人员管理-删除人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public PersonBean deletePerson(PersonBean bean);
}
