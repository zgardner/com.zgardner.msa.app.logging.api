package com.zgardner.msa.app.logging.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zgardner.msa.app.logging.api.model.LogRequestModel;
import com.zgardner.msa.app.logging.api.model.LogModel;
import com.zgardner.msa.app.logging.api.service.LoggingService;

@RestController
public class LoggingController {
	
	LoggingService loggingService = new LoggingService();
	
	@RequestMapping("/log")
	public ResponseEntity<LogModel> log (@RequestBody LogRequestModel logRequestModel) {
		LogModel logModel = this.loggingService.log(logRequestModel);
		
		return new ResponseEntity<LogModel>(logModel, HttpStatus.CREATED);
	}
}
