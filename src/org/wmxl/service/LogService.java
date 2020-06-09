package org.wmxl.service;

import java.util.List;

import org.wmxl.dao.LogDao;
import org.wmxl.model.Log;

public class LogService {
	LogDao dao = new LogDao();
	
	public List<Log> getLogList(){
		return dao.getLogList();
	}
	
	public Log getLog(String id) {
		return dao.getLog(id);
	}
	
	public void update(String id, String name, String description, String data) {
		dao.update(id, name, description, data);
    }
	
	//For Text
	public boolean upload(String name, String description, String data) {
		return dao.upload(name, description, data);
	}
	
	//For Audio, Video, Image
	public boolean upload(String name, String description, String data, double size, String type) { 
		return dao.upload(name, description, data, size, type);
	}
	
	public void delete(String id) {
		dao.delete(id);
    }
}
