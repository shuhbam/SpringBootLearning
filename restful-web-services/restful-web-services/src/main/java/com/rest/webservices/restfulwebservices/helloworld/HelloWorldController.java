package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
	public String getRequest() {
		return "HelloWorld!!";
	}

	@GetMapping(path = "/helloWorld2")
	public String getRequest2() {
		return "HelloWorld2!!";
	}

	@GetMapping(path = "/helloWorldBean")
	public HelloWorldBean getRequetBean() {
		return new HelloWorldBean("HelloWorld Bean!!",123);
	}
	
	//eg: /helloWorldBean/path-variable/{in28minutes}
	@GetMapping(path = "/helloWorldBean/path-variable/{name}")
	public HelloWorldBean getRequetBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("HelloWorld Bean!!, %s",name),123);
	}
}