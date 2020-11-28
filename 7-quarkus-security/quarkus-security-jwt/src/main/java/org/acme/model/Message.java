package org.acme.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 */
public class Message {

	public String content;

	public Message(String content) {
		super();
		this.content = content;
	}

	public Message() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Message [content=" + content + "]";
	}

}
