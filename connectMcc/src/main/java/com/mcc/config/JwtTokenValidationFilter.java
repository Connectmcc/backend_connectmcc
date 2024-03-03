package com.mcc.config;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtTokenValidationFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String jwt=request.getHeader(SecurityContext.HEADER);
		//
		if(jwt !=null) {
			try {
				jwt=jwt.substring(7);
				
				SecretKey key=Keys.hmacShaKeyFor(SecurityContext.JWT_KEY.getBytes());
				
			}
			catch(Exception e) {}
			
		}
		
	}

}
