package com.myapp.User.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.User.Dao.UserSignDao;

@Service("UserSignService")
@MapperScan(basePackages="com.myapp.User.Dao")//탐색할 패키시 설정
public class UserSignServiceImpl implements UserSignService{

@Autowired
private UserSignDao UserSignDao;
	
	@Override
public List<Map<String,Object>> Login(Map<String, Object> paramMap) throws SQLException {
	// TODO Auto-generated method stub
	return UserSignDao.Login(paramMap);
}
@Override
public List<Map<String, Object>> SignUp(Map<String, Object> paramMap) throws SQLException {
	// TODO Auto-generated method stub
	return UserSignDao.SignUp(paramMap);
	}	
@Override
	public List<Map<String, Object>> Idcheck(Map<String, Object> paramMap) throws SQLException {
		// TODO Auto-generated method stub
		return UserSignDao.Idcheck(paramMap);
	}
}
