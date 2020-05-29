package org.alsa.springcore.dto;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/29
 * @Time: 11:12
 * @Description:
 */
public class User {
	private Long id;
	private String name;
	private String code;
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
