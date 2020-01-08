package com.fjg.base;
//package com.fjg;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.fjg.model.Empee;
//import com.fjg.service.EmpeeService;
//import com.fjg.service.TokenManager;
//
//public class TokenLoginFilter extends UsernamePasswordAuthenticationFilter {
//
////	@Autowired
////	private EmpeeService empserv;
////	private AuthenticationManager authenticationManager;
////	private TokenManager tokenManager;
////	
////	public TokenLoginFilter(AuthenticationManager authenticationManager, TokenManager tokenManager) {
////		this.authenticationManager = authenticationManager;
////		this.tokenManager = tokenManager;
////		//设置过滤器地址（表单认证提交的地址)
////		super.setFilterProcessesUrl("/auth/login");
////	}
////	@Override
////	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
////			throws AuthenticationException {
////		String username = request.getParameter(getUsernameParameter());
////		String usepassw = request.getParameter(getPasswordParameter());
////		
////		System.out.println("用户名："+username);
////		System.out.println("密码："+usepassw);
////		
////		return authenticationManager.authenticate(
////                new UsernamePasswordAuthenticationToken(username, usepassw, new ArrayList<GrantedAuthority>())
////        );
////
////	}
////	@Override
////	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
////			Authentication authResult) throws IOException, ServletException {
////		List<String> roles = new ArrayList<String>();
////        Collection<? extends GrantedAuthority> authorities = authResult.getAuthorities();
////        for (GrantedAuthority authority : authorities){
////            roles.add(authority.getAuthority());
////        }
////        System.out.println("roles:"+roles);
////        String token = tokenManager.createToken(authResult.getName());
////        System.out.println("用户名："+authResult.getName());
////		System.out.println("生成TOKEN："+token);
////		
////		response.sendRedirect("/role/home?token="+token);
//////		chain.doFilter(request, response);
////		
////	}
////	@Override
////	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
////			AuthenticationException failed) throws IOException, ServletException {
////		 response.setCharacterEncoding("UTF-8");
////	        response.setContentType("application/json; charset=utf-8");
////	        response.getWriter().write("认证失败");
////
////	}
//}
