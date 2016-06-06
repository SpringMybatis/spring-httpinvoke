package com.huayun.invoke.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Role implements Serializable {

	private Integer id;

	private String name;

	private String code;

	private String desc;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role() {
		super();
	}

	public Role(Integer id, String name, String code, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.desc = desc;
	}

}
