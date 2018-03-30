package com.wanggt.freedom.springcloud.study.person.util.json;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.IOUtils;

/**
 * JSON操作的工具类，使用了alibaba的fastJson包
 * @author freedom wang
 * @date 2017年6月15日上午9:59:35
 * @since 1.0
 */
public class JSONUtil {

	/**
	 * 解析JSON字符串
	 * @param json
	 * @param targetClass
	 * @return
	 * @author freedom wang
	 * @date 2017年6月15日上午10:00:26
	 * @since 1.0
	 */
	public static <T> T parse(String json, Class<T> targetClass) {
		return JSON.parseObject(json, targetClass);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午12:03:56
	 * @since 1.0
	 */
	public static Object parseObject(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.get(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Short类型的值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午1:51:11
	 * @since 1.0
	 */
	public static Short parseShort(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getShort(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Boolean类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static Boolean parseBoolean(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getBoolean(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的boolean类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static boolean parseBooleanVaule(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getBooleanValue(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Byte类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static Byte parseByte(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getByte(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的byte[]类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static byte[] parseBytes(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getBytes(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Date类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static Date parseDate(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getDate(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Double类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static Double parseDouble(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getDouble(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的double类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static double parseDoubleValue(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getDoubleValue(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Float类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static Float parseFloat(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getFloat(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的float类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static float parseFloatValue(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getFloatValue(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的Integer类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static Integer parseInteger(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getInteger(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的int类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static int parseIntValue(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getIntValue(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的JSONArray类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年12月2日下午4:55:30
	 * @version 1.0
	 */
	public static String[] parseArrayString(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		Object value = parseObject.get(key);

		if (value instanceof String[]) {
			return (String[]) value;
		} else if (value instanceof List<?>) {
			return ((List<?>) value).toArray(new String[0]);
		}

		throw new JSONException("不能把值转换为String[], 值 : " + value);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的JSONObject类型值
	 * @param json 需要解析的JSON字符串
	 * @param key 属性名
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午2:02:55
	 * @since 1.0
	 */
	public static JSONObject parseJSONObject(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getJSONObject(key);
	}

	/**
	 * 解析JSON字符串，获取JSON中的某一个属性的字符串值
	 * @param json
	 * @param key
	 * @return
	 * @author freedom wang
	 * @date 2017年7月14日下午12:03:56
	 * @since 1.0
	 */
	public static String parseString(String json, String key) {
		JSONObject parseObject = JSON.parseObject(json);
		return parseObject.getString(key);
	}

	public static byte[] castToBytes(Object value) {
		if (value instanceof byte[]) {
			return (byte[]) value;
		}

		if (value instanceof String) {
			return IOUtils.decodeBase64((String) value);
		}
		throw new JSONException("can not cast to int, value : " + value);
	}
}
