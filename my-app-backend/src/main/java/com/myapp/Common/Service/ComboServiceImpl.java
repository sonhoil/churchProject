package com.myapp.Common.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.Common.Dao.ComboDao;
import com.myapp.User.Service.UserSignService;

@Service("ComboService")
@MapperScan(basePackages="com.myapp.Common.Dao")//탐색할 패키시 설정
public class ComboServiceImpl implements ComboService {

	@Autowired
	private ComboDao ComboDao;
	
	@Override
	public List<Map<String, Object>> ChurchAreaList(Map<String, Object> paramMap) throws SQLException {
		// TODO Auto-generated method stub
		return ComboDao.ChurchAreaList(paramMap);
	}
	
	@Override
	public List<Map<String, Object>> ChurchList(Map<String, Object> paramMap) throws SQLException {
		// TODO Auto-generated method stub
		return ComboDao.ChurchList(paramMap);
	}
	@Override
	public List<Map<String, Object>> ChurchNameSearch(Map<String, Object> paramMap) throws SQLException {
		// TODO Auto-generated method stub
		return  ComboDao.ChurchNameSearch(paramMap);
	}
}
