package com.fjg.base;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.fjg.model.Empee;
import com.fjg.service.EmpeeService;

@Component("empeeDetailsService")
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private EmpeeService empeesm;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Empee userFromDatabase = empeesm.findEmpeeByKey(username);
		if (userFromDatabase == null ) {
			throw new UsernameNotFoundException("用戶："+ username + "數據庫沒有找到");
		}
		System.out.println("连接用户："+userFromDatabase.getUsername());
		System.out.println("连接用户角色："+userFromDatabase.getRolename());
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userFromDatabase.getRolename());
		 grantedAuthorities.add(grantedAuthority);
		return new User(username,userFromDatabase.getPassw(),grantedAuthorities);
	}
}
