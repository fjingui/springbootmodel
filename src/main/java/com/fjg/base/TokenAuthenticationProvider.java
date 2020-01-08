package com.fjg.base;
//package com.fjg;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Component;
//
//import com.fjg.model.Empee;
//import com.fjg.service.EmpeeService;
//import com.fjg.service.TokenManager;
//
//@Component
//public class TokenAuthenticationProvider implements AuthenticationProvider {
//
//	@Autowired
//	private EmpeeService empserv;
//	@Autowired
//	private TokenManager tokenmanage;
//
//	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//		String userName = authentication.getPrincipal().toString();
//		Empee user = empserv.findEmpeeByKey(userName);
//
//		if (user == null) {
//			throw new BadCredentialsException("查无此用户");
//		}
//		if (user.getPassw() != null && user.getPassw().equals(authentication.getCredentials())) {
//			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(user.getRolename());
//			authorities.add(grantedAuthority);
//			String token = tokenmanage.createToken(user.getUsername());
//			System.out.println("生成TOKEN："+token);
//			return new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassw(), authorities);
//		} else {
//			throw new BadCredentialsException("用户名或密码错误。");
//		}
//	}
//	
//	public boolean supports(Class<?> authentication) {
////		必须true
//		return true;
//	}
//
//}
