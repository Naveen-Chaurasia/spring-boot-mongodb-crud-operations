package com.naveen.models;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "name" })

public class User {
	@Id
	public String id;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "role")
	private String role;

	public User() {
	}
	public User(String name) {
		this.name=name;
	}

	public User(String name, String id, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

}
