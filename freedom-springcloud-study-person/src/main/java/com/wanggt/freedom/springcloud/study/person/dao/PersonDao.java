package com.wanggt.freedom.springcloud.study.person.dao;

import java.util.List;

import com.wanggt.freedom.springcloud.study.person.entity.PersonBean;

/**
 * 人员管理-Dao
 * @author freedom wang
 * @date 2017年08月09日09时13分
 * @since 1.0
 */
public interface PersonDao {

	/**
	 * 人员管理-查询人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public List<PersonBean> getPersons();

	/**
	 * 人员管理-根据kid查询人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
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
	public int addPerson(PersonBean bean);

	/**
	 * 人员管理-修改人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public int updatePerson(PersonBean bean);

	/**
	 * 人员管理-删除人员
	 * @param bean
	 * @return
	 * @author freedom wang
	 * @date 2017年08月09日09时13分
	 * @since 1.0
	 */
	public int deletePerson(PersonBean bean);
}
