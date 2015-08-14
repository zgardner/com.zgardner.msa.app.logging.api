package com.zgardner.msa.app.logging.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zgardner.msa.app.logging.api.model.LogRequestModel;
import com.zgardner.msa.app.logging.api.model.LogResponseModel;
import com.zgardner.msa.app.logging.api.service.LoggingService;

@RestController
public class LoggingController {
	
	LoggingService loggingService = new LoggingService();
	
	@RequestMapping("/log")
	public LogResponseModel log (@RequestBody LogRequestModel logRequestModel) {
		return this.loggingService.log(logRequestModel);
	}
}
