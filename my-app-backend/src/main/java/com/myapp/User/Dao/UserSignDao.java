package com.myapp.User.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

@Configuration("UserSignDao")
public interface UserSignDao {
	public  List<Map<String,Object>> Login (Map<String, Object> paramMap) throws SQLException;

	public List<Map<String,Object>> SignUp (Map<String, Object> paramMap) throws SQLException;
	public List<Map<String,Object>> Idcheck (Map<String, Object> paramMap) throws SQLException;
}
