package com.fjg.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.fjg.service.TokenManager;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailService empeeDetailsService;
//	@Autowired
//	private TokenAuthenticationProvider tokenauthpro;
//	@Autowired
//	private TokenManager tokenManager;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		开启跨域請求訪問
//		http.cors().and()
//		关闭（csrf攻擊）
		http
		.csrf().disable().exceptionHandling().and()
//		配置跨域支持
		.cors()
		.and()
//		 基于token，所以不需要session
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeRequests()
//		.anyRequest().permitAll()
		.antMatchers("/role/admin").hasRole("ADMIN")
		.antMatchers("/role/user").hasRole("USER")
//		.antMatchers(HttpMethod.DELETE,"/tasks/**").hasAnyRole("ADMIN")
        // 测试用资源，需要验证了的用户才能访问
//        .antMatchers("/tasks/**").authenticated()
		.anyRequest().authenticated()
		.and()
		.formLogin()
//		.usernameParameter("username").passwordParameter("password")
//		.loginPage("/role/loginpage")
		.permitAll()
		.and()
		.httpBasic().disable();
//		.addFilter(new TokenLoginFilter(authenticationManager(),tokenManager))
//		.addFilter(new TokenAuthenticationFilter(authenticationManager(), tokenManager));
		
//		http
//		.authorizeRequests()
//		.antMatchers("/role/admin").hasRole("ADMIN")
//		.antMatchers("/role/user").hasRole("USER")
//		.anyRequest().authenticated()
//		.and()
//		.formLogin()
//		.permitAll()
//		.and()
//		.httpBasic().disable();
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(empeeDetailsService).passwordEncoder(new BCryptPasswordEncoder());
//		auth.authenticationProvider(tokenauthpro);
		
	}
}
