package com.fjg.base;
//package com.fjg;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
////Order重要，否則會被springsecurity忽視
//@Order(Ordered.HIGHEST_PRECEDENCE)
//@Component
//public class CorsFilter implements Filter {
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
////        HttpServletResponse res = (HttpServletResponse) response;
////        res.addHeader("Access-Control-Allow-Credentials", "true");
////        res.addHeader("Access-Control-Allow-Origin", "*");
////        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
////        res.addHeader("Access-Control-Allow-Headers", "Content-Type,X-CAF-Authorization-Token,sessionToken,X-TOKEN");
////        if (((HttpServletRequest) request).getMethod().equals("OPTIONS")) {
////            response.getWriter().println("ok");
////            return;
////        }
//        chain.doFilter(request, response);
//    }
//    public void destroy() {
//    }
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//
//}
