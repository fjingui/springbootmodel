package com.fjg.service;

public interface TokenManager {

	public String createToken(String username);

	public String getUserFromToken(String token);

	public void removeToken(String token);
}
