package com.zgardner.msa.app.logging.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="logs")
public class LogModel {
	
	@Id
	@Column(name="log_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int log_id;
	
	private String level;
	
	private String origin_name;
	
	private Date origin_time;
	
	private String message;
	
	private String transaction_id;
	
	public int getLogId () {
		return this.log_id;
	}
	
	public void setLogId (int log_id) {
		this.log_id = log_id;
	}
	
	public String getLevel () {
		return this.level;
	}
	
	public void setLevel (String level) {
		this.level = level;
	}
	
	public String getOriginName () {
		return this.origin_name;
	}
	
	public void setOriginName (String origin_name) {
		this.origin_name = origin_name;
	}
	
	public Date getOriginTime () {
		return this.origin_time;
	}
	
	public void setOriginTime (Date origin_time) {
		this.origin_time = origin_time;
	}
	
	public String getMessage () {
		return this.message;
	}
	
	public void setMessage (String message) {
		this.message = message;
	}
	
	public String getTransactionId () {
		return this.transaction_id;
	}
	
	public void setTransactionId (String transaction_id) {
		this.transaction_id = transaction_id;
	}
}
