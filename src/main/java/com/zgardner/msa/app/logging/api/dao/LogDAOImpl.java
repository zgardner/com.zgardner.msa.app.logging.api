package com.zgardner.msa.app.logging.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zgardner.msa.app.logging.api.model.LogModel;

public class LogDAOImpl implements LogDAO {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void log (LogModel logModel) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(logModel);
		transaction.commit();
		session.close();		
	}
	
	@Override
	public List<LogModel> logs () {
		Session session = this.sessionFactory.openSession();
		List<LogModel> logModelList = session.createQuery("from logs").list();
		session.close();
		
		return logModelList;
	}
}
