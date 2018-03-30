package com.wanggt.freedom.springcloud.study.person.entity;

/**
 * 分页基础，所有需要实现分页功能的查询的Bean都要继承此类
 * @author freedom wang
 * @date 2017年6月19日上午9:15:33
 * @since 1.0
 */
public class PageBase{
	private Integer pageNum;// 页数
	private Integer pageSize;// 每页数量

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
