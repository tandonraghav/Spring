package com.spring.demo.rest;

import org.springframework.stereotype.Service;

@Service("businessLayerImpl")
public class BusinessLayerImpl implements BusinessLayer{

	@Override
	public String callFoo(String a) {
		return a;
	}

}
