package com.spring.demo.rest;

import org.springframework.stereotype.Service;

@Service("businessLayerImpl2")
public class BusinessLayerImpl2 implements BusinessLayer{

	@Override
	public String callFoo(String a) {
		return "This is from impl2"+a;
	}

}
