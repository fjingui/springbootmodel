package com.fjg.base;
//package com.fjg;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//import org.springframework.util.StringUtils;
//
//import com.fjg.service.TokenManager;
//
//public class TokenAuthenticationFilter extends BasicAuthenticationFilter {
//
//	private TokenManager tokenManager;
//	
//	public TokenAuthenticationFilter(AuthenticationManager authenticationManager,
//			TokenManager tokenManager) {
//		super(authenticationManager);
//		this.tokenManager=tokenManager;
//	}
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		String header =request.getHeader("Authorization");
//		System.out.println("获取头"+header);
//		
//		if(header == null) {
//			chain.doFilter(request, response);
//			return;
//		}
//		UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
//
//		if (authentication != null) {
//			SecurityContextHolder.getContext().setAuthentication(authentication);
//		}
//		chain.doFilter(request, response);
//	}
//		private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
//			String token =request.getHeader("token");
//			if (token != null && "".equals(token.trim())) {
//				// parse the token.
//				String userName = tokenManager.getUserFromToken(token);
//
//				if (!StringUtils.isEmpty(userName)) {
//					return new UsernamePasswordAuthenticationToken(userName, token);
//				}
//				return null;
//			}
//			return null;
//		}
//
//	}
//
//
