package com.zgardner.msa.app.logging.api.dao;

import java.util.List;

import com.zgardner.msa.app.logging.api.model.LogModel;

public interface LogDAO {
	public void log (LogModel logModel);
	
	public List<LogModel> logs();
}
