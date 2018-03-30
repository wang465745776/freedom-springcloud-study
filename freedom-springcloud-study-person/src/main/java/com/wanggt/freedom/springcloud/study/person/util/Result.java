package com.wanggt.freedom.springcloud.study.person.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * @author freedom wang
 * @date 2017年6月15日下午12:32:17
 * @since 1.0
 */
public class Result extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public enum ReturnCode {
		/** 操作成功：200 */
		SUCCESS(200, "操作成功！"),

		/** 操作失败：500 */
		ERROR(500, "操作失败");

		private int code;// 返回码
		private String message;// 返回值

		private ReturnCode(int code, String message) {
			this.code = code;
			this.message = message;
		}

		public int getCode() {
			return code;
		}

		public String getMessage() {
			return message;
		}

	}

	/**
	 * 构建一个返回，默认为成功操作
	 * @author freedom wang
	 * @date 2017年6月15日下午12:41:50
	 * @since 1.0
	 */
	public Result() {
		put(ReturnCode.SUCCESS);
	}

	/**
	 * 返回错误操作码
	 * @return
	 * @author freedom wang
	 * @date 2017年6月15日下午12:41:35
	 * @since 1.0
	 */
	public static Result error() {
		Result r = new Result();
		return r.put(ReturnCode.ERROR);
	}

	/**
	 * 返回其他错误操作码
	 * @param message
	 * @return
	 * @author freedom wang
	 * @date 2017年6月15日下午12:51:09
	 * @since 1.0
	 */
	public static Result error(String message) {
		return custom(ReturnCode.ERROR.getCode(), message);
	}

	/**
	 * 返回成功操作码
	 * @return
	 * @author freedom wang
	 * @date 2017年6月15日下午12:41:23
	 * @since 1.0
	 */
	public static Result success() {
		return new Result();
	}

	/**
	 * 成功操作码
	 * @param message
	 * @return
	 * @author freedom wang
	 * @date 2017年6月15日下午12:51:09
	 * @since 1.0
	 */
	public static Result success(String message) {
		return custom(ReturnCode.SUCCESS.getCode(), message);
	}

	/**
	 * 返回自定义操作码
	 * @param key
	 * @param value
	 * @return
	 * @author freedom wang
	 * @date 2017年6月15日下午12:42:15
	 * @since 1.0
	 */
	public static Result custom(int code, String message) {
		Result r = new Result();
		r.put("code", code);
		r.put("message", message);
		return r;

	}

	@Override
	public Result put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public Result put(ReturnCode returnCode) {
		put("code", returnCode.getCode());
		put("message", returnCode.getMessage());
		return this;
	}

	public Result put(Map<String, Object> map) {
		putAll(map);
		return this;
	}

	/**
	 * 设置返回结果
	 * @param object
	 * @return
	 * @author freedom wang
	 * @date 2018年3月28日下午10:04:04
	 * @version 1.0
	 */
	public Result result(Object object) {
		put("result", object);
		return this;
	}
}
