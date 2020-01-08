package com.fjg.base;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncodeDeconde {

	public static void main(String[] args) {
		String pass1="user1";
		String pass2="admin1";
		BCryptPasswordEncoder bcpenconder = new BCryptPasswordEncoder();
		String encodepass1 = bcpenconder.encode(pass1);
		String encodepass2 = bcpenconder.encode(pass2);
		System.out.println(encodepass1);
		System.out.println(encodepass2);
		boolean p1 = bcpenconder.matches(pass1, encodepass1);
		boolean p2 = bcpenconder.matches(pass2, encodepass2);
		
//		String pass1="user1";
//		String pass2="$2a$10$V4vInf5zfccjmxcSgpMXzOZ6vxKu1vaw0K1VxdLL6K02D93NjZxpe";
//		boolean p2 = new BCryptPasswordEncoder().matches(pass1, pass2);
//		System.out.println("if_match:"+p2);
	}
}
