package com.zgardner.msa.app.logging.api.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zgardner.msa.app.logging.api.model.LogRequestModel;
import com.zgardner.msa.app.logging.api.model.LogModel;
import com.zgardner.msa.app.logging.api.dao.LogDAO;

public class LoggingService {
	
	public LogModel log (LogRequestModel logRequestModel) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        LogDAO logDAO = context.getBean(LogDAO.class);
		
		LogModel logModel = new LogModel();
		
		logModel.setLevel(logRequestModel.level);
		logModel.setOriginName(logRequestModel.originName);
		logModel.setOriginTime(logRequestModel.originTime);
		logModel.setMessage(logRequestModel.message);
		logModel.setTransactionId("ZGTEST");
		
		logDAO.log(logModel);
		
		return logModel;
	}
}
