package com.sks.learn.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sks.learn.microservices.limitsservices.CustomConfiguration;
import com.sks.learn.microservices.limitsservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigController {

	@Autowired
	private CustomConfiguration config;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}
}
