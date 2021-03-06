package com.myapp.Common.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("ComboService")
public interface ComboService {
	List<Map<String,Object>> ChurchAreaList (Map<String, Object> paramMap) throws SQLException;
	
	List<Map<String,Object>> ChurchList (Map<String, Object> paramMap) throws SQLException;
	List<Map<String,Object>> ChurchNameSearch (Map<String, Object> paramMap) throws SQLException;
}
