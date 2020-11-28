package org.acme.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 */
public class User {

	public String username;
	public String password;
	public Set<Role> roles;

	public User(String username, String password, Set<Role> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", roles=" + roles + "]";
	}

	// this is just an example, you can load the user from the database (via
	// PanacheEntityBase)
	public static User findByUsername(String username) {

		// if using Panache pattern (extends or PanacheEntity PanacheEntityBase)
		// return find("username", username).firstResult();

		Map<String, User> data = new HashMap<>();

		// username:passwowrd -> user:user
		data.put("user",
				new User("user", "cBrlgyL2GI2GINuLUUwgojITuIufFycpLG4490dhGtY=", Collections.singleton(Role.USER)));

		// username:passwowrd -> admin:admin
		data.put("admin",
				new User("admin", "dQNjUIMorJb8Ubj2+wVGYp6eAeYkdekqAcnYp+aRq5w=", Collections.singleton(Role.ADMIN)));

		if (data.containsKey(username)) {
			return data.get(username);
		} else {
			return null;
		}
	}

}