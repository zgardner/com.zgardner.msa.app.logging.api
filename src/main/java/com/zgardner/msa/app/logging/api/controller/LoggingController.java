package com.zgardner.msa.app.logging.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zgardner.msa.app.logging.api.model.LoggingResponseModel;

@RestController
@RequestMapping("/hello")
public class LoggingController {
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody LoggingResponseModel zgtest () {
		LoggingResponseModel loggingResponseModel = new LoggingResponseModel();
		
		loggingResponseModel.id = 1;
		
		return loggingResponseModel;
	}
}
