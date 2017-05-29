package com.spring.demo.rest;



import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestRestController {
	
	@Autowired @Qualifier("businessLayerImpl") BusinessLayer businessLayer;
	@Autowired @Qualifier("businessLayerImpl2") BusinessLayer businessLayer2;
	//@Autowired Arushi arushi;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST,consumes={MediaType.APPLICATION_JSON})
	@ResponseStatus(value=HttpStatus.CREATED)
	public String create(@RequestParam String name){
		return businessLayer.callFoo(name);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST,consumes={MediaType.TEXT_PLAIN})
	@ResponseStatus(value=HttpStatus.CREATED)
	public String create2(@RequestParam String name){
		return businessLayer2.callFoo(name);
	}
}
