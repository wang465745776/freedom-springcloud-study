package com.wanggt.freedom.springcloud.study.person.config.mybatis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "jdbc")
@Component
@PropertySource(value = "classpath:db.properties")
public class DBProperties {

	private String driverClassName;// 驱动器

	private String url;// 数据库链接

	private String username; // 用户名

	private String password;// 密码

	private int acquireIncrement;// 连接池在无空闲连接可用时一次性创建的新数据库连接数
	private int initialSize;// 连接池初始化时创建的连接数
	private int maxPoolSize;// 连接池中保留的最大连接数

	private int minPoolSize;// 连接池保持的最小连接数
	private String maxIdleTime;// 连接的最大空闲时间，如果超过这个时间，某个数据库连接还没有被使用，则会断开掉这个连接。
	private String idleConnectionTestPeriod;// 多少秒检查所有连接池中的空闲连接

	public int getAcquireIncrement() {
		return acquireIncrement;
	}

	public void setAcquireIncrement(int acquireIncrement) {
		this.acquireIncrement = acquireIncrement;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}

	public String getMaxIdleTime() {
		return maxIdleTime;
	}

	public void setMaxIdleTime(String maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
	}

	public String getIdleConnectionTestPeriod() {
		return idleConnectionTestPeriod;
	}

	public void setIdleConnectionTestPeriod(String idleConnectionTestPeriod) {
		this.idleConnectionTestPeriod = idleConnectionTestPeriod;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
