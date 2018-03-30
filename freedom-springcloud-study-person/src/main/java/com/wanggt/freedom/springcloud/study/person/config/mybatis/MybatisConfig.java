package com.wanggt.freedom.springcloud.study.person.config.mybatis;

import java.beans.PropertyVetoException;
import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 此类为Mybatis整合Spring的配置类
 * 
 * @author freedom wang
 * @date 2018年3月28日上午11:20:40
 * @version 1.0
 */
@Configuration
public class MybatisConfig {

	private Logger logger = LoggerFactory.getLogger(MybatisConfig.class);
	
	/**
	 * 设置数据源，使用的时C3P0的连接池
	 * @param dbProperties
	 * @return
	 * @throws PropertyVetoException
	 * @author freedom wang
	 * @date 2018年3月28日上午11:53:59
	 * @version 1.0
	 */
	@Bean
	public ComboPooledDataSource dataSource(DBProperties dbProperties) throws PropertyVetoException {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setDriverClass(dbProperties.getDriverClassName());
		comboPooledDataSource.setJdbcUrl(dbProperties.getUrl());
		comboPooledDataSource.setUser(dbProperties.getUsername());
		comboPooledDataSource.setPassword(dbProperties.getPassword());
		comboPooledDataSource.setAcquireIncrement(dbProperties.getAcquireIncrement());
		comboPooledDataSource.setMinPoolSize(dbProperties.getMinPoolSize());
		comboPooledDataSource.setMaxPoolSize(dbProperties.getMaxPoolSize());
		comboPooledDataSource.setInitialPoolSize(dbProperties.getInitialSize());
		
		return comboPooledDataSource;
	}

	/**
	 * 当容器中没有SQL会话工厂时就创建一个
	 * @param dataSource
	 * @return
	 * @author freedom wang
	 * @date 2018年3月28日上午11:01:47
	 * @version 1.0
	 */
	@Bean
	@ConditionalOnMissingBean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		// 设置数据源
		sqlSessionFactoryBean.setDataSource(dataSource);
		// 设置mybatis的主配置文件
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource mybatisConfigXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
		sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);
		
		// 自动扫描mapping.xml文件，*是通配符,**表示迭代查找
		try {
			Resource[] mapperResouces = resolver.getResources("classpath:mybatis/mapper/*Mapper.xml");
			sqlSessionFactoryBean.setMapperLocations(mapperResouces);
		} catch (IOException e) {
			logger.error("自动扫描mapper.xml文件出现了问题，{}", e);
		}

		return sqlSessionFactoryBean;
	}

	/**
	 * 自动扫描对象关系映射
	 * @return
	 * @author freedom wang
	 * @date 2018年3月28日上午11:07:36
	 * @version 1.0
	 */
	@Bean
	public MapperScannerConfigurer MapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		// 指定会话工厂
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");

		// 指定要自动扫描接口的基础包，实现接口
		mapperScannerConfigurer.setBasePackage("com.wanggt.freedom.springcloud.study.person.dao");

		return mapperScannerConfigurer;
	}

}
