package com.fjg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fjg.model.Empee;
import com.fjg.model.Fuser;
import com.fjg.service.EmpeeService;
import com.fjg.service.FuserService;


//@CrossOrigin(allowCredentials="true")
@Controller
@RequestMapping("/role")
public class UserRoleTest {

	@Autowired
	private EmpeeService empeesv;
	@RequestMapping("/admin")
	public String adminInfo() {
		return "admin";
	}
	
	@RequestMapping("/user")
	public String userInfo() {
		return "user";
	}
	@RequestMapping("/loginpage")
	public String login() {
		return "loginpage";
	}
	@RequestMapping("/home")
	public String home() {
		return "homepage";
	}
	@ResponseBody
	@RequestMapping(value="/find")
	public Empee findFuserByKey( @RequestParam String username) {
		return empeesv.findEmpeeByKey(username);
	}

	@ResponseBody
	@RequestMapping(value="/login" )
	public String checkLogin(@RequestParam String username, @RequestParam String smscode ) {
		
	   Empee emp = empeesv.findEmpeeByKey(username);
	   if (emp.getUsername().equals(username) && emp.getPassw().equals(smscode)) {
		   return "成功";
	   }
		return "失败";
	}
}
