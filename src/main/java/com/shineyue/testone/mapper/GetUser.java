package com.shineyue.testone.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

/**
 * SQLProvider sql语句
 * @author HUAWEI
 */
public class GetUser {
	public String getUser(Map<String,Object> para) {
		SQL sql = new SQL();
		sql.SELECT("userid as id","username as name","age","birth");
		sql.FROM("test");
		sql.WHERE("userid="+para.get("userid"));
		return sql.toString();
	}

}
