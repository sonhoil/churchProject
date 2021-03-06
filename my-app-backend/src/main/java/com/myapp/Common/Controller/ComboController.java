package com.myapp.Common.Controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.Common.Service.ComboService;

@RestController
@RequestMapping("/common")
public class ComboController {
	@Autowired
	private ComboService comboservice;
	
	/**
	 * @param requestMap
	 * @return Map<String, Object>
	 * @throws SQLException
	 * @description 지구검색
	 */
	@ResponseBody
	@RequestMapping(value="churchAreaList.do", method=RequestMethod.POST)
	public  Map<String,Object> ChurchAreaList (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("JavaData", comboservice.ChurchAreaList(paramMap));
		return resultMap;
	}
	
	/**
	 * @param requestMap
	 * @return Map<String, Object>
	 * @throws SQLException
	 * @description 본당검색
	 */
	@ResponseBody
	@RequestMapping(value="churchList.do", method=RequestMethod.POST)
	public  Map<String,Object> ChurchList (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("JavaData", comboservice.ChurchList(paramMap));
		return resultMap;
	}
	
	/**
	 * @param requestMap
	 * @return Map<String, Object>
	 * @throws SQLException
	 * @description 세례명검색
	 */
	@ResponseBody
	@RequestMapping(value="churchNameSearch.do", method=RequestMethod.POST)
	public  Map<String,Object> ChurchNameSearch (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		System.out.println(paramMap);
		
		resultMap.put("JavaData", comboservice.ChurchNameSearch(paramMap));
		return resultMap;
	}
	
	
}
