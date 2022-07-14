package com.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	private String msg;
	private int id;

	public HelloWorldBean(String msg, int id) {
		this.msg = msg;
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	// setter not required as we're setting it from the constructor public void
	public void setMessage(String message) {
		this.msg = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// completed till 6th video enhancing the helloworld to return the bean
}
