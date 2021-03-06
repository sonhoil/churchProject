package com.myapp.User.Controller;

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

import com.myapp.User.Service.UserSignService;


@RestController
@RequestMapping("/user")
public class UserSignController {
	
	@Autowired
	private UserSignService Usersignservice;
	
	/**
	 * @param requestMap
	 * @return Map<String, Object>
	 * @throws SQLException
	 * @description 로그인
	 */
	@ResponseBody
	@RequestMapping(value="Login.do", method=RequestMethod.POST)
	public  Map<String,Object> Login (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("JavaData", Usersignservice.Login(paramMap));
		return resultMap;
	}
	/**
	 * @param requestMap
	 * @return Map<String, Object>
	 * @throws SQLException
	 * @description 회원가입
	 */
	@ResponseBody
	@RequestMapping(value="SignUp.do", method=RequestMethod.POST)
	public  Map<String,Object> SignUp (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		System.out.println(paramMap);
		resultMap.put("JavaData", Usersignservice.SignUp(paramMap));
		return resultMap;
	}
	/**
	 * @param requestMap
	 * @return Map<String, Object> 
	 * @throws SQLException
	 * @description 아이디 중복 체크
	 */
	@ResponseBody
	@RequestMapping(value="IdCheck.do", method=RequestMethod.POST)
	public  Map<String,Object> Idcheck (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("JavaData", Usersignservice.Idcheck(paramMap));
		return resultMap;
	}
}