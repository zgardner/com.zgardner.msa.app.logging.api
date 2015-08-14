package com.zgardner.msa.app.logging.api.service;

import com.zgardner.msa.app.logging.api.model.LogRequestModel;
import com.zgardner.msa.app.logging.api.model.LogResponseModel;

public class LoggingService {
	
	public LogResponseModel log (LogRequestModel logRequestModel) {
		LogResponseModel logResponseModel = new LogResponseModel();
		
		logResponseModel.logId = logRequestModel.logId;
		
		return logResponseModel;
	}
}
