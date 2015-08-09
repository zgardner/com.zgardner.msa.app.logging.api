package com.zgardner.msa.app.logging.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zgardner.msa.app.logging.api.model.LoggingResponseModel;

@RestController
@RequestMapping("/hello")
public class LoggingController {
	@RequestMapping(method = RequestMethod.GET)
	public String zgtest () {
		return new String("Test123");
	}
}
