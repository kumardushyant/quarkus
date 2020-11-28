package org.acme.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 */

public class  AuthRequest {
	
	public String username;
	public String password;
	public AuthRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	
	public AuthRequest() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "AuthRequest [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
