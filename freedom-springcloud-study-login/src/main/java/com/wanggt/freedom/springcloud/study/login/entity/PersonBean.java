package com.wanggt.freedom.springcloud.study.login.entity;

/**
 * 人员管理-bean
 * @author freedom wang
 * @date 2018年3月28日下午1:40:30
 * @version 1.0
 */
public class PersonBean {
	private long iid;// 自增字段
	private String kid;// 唯一标识字段
	private String name;// 用户名
	private String account;// 账号
	private String password;// 密码
	private String sex;// 性别
	private String identitycard;// 身份证号码
	private String email;// 电子邮箱
	private String phone;// 电话号码
	private java.sql.Date birthday;// 出生日期
	private int activationValue;// 激活点
	private int isAdmin;// 是否为系统管理员，0为否，1为是

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int getActivationValue() {
		return activationValue;
	}

	public void setActivationValue(int activationValue) {
		this.activationValue = activationValue;
	}

	public long getIid() {
		return iid;
	}

	public void setIid(long iid) {
		this.iid = iid;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdentitycard() {
		return identitycard;
	}

	public void setIdentitycard(String identitycard) {
		this.identitycard = identitycard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public java.sql.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.sql.Date birthday) {
		this.birthday = birthday;
	}

}