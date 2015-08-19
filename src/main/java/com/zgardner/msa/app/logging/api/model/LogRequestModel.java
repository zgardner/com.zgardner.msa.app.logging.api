package com.zgardner.msa.app.logging.api.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class LogRequestModel {
	public String level;
	
	public String originName;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
	public Date originTime;
	
	public String message;
}
