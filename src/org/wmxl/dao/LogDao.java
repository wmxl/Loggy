package org.wmxl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.wmxl.model.Log;

public class LogDao {
	
	public List<Log> getLogList(){
		Log log = null;
		List<Log> logList = new ArrayList<>();
		 try { 
            Connection con = DBConnection.getConnection();
            System.out.println(con);

            String sql = "select * from logs order by internalID desc";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
            	log = new Log();
            	String id = rs.getString(1);
    			String name =rs.getString(2);
        		String des =rs.getString(3);
        		String data =rs.getString(4);
        		double size =rs.getDouble(5);
        		String type =rs.getString(6);
        		log.setId(id);
        		log.setName(name);
        		log.setDescription(des);
        		log.setData(data);
        		log.setSize(size);
        		log.setType(type);
        		logList.add(log);
	            }
		 	}catch (Exception e) { 
        	e.printStackTrace();
        }
		 return logList;
	}
	
	public Log getLog(String id) {
		Log log = null;
		try { 
            Connection con = DBConnection.getConnection();
            
        	String sql = "select * from logs where id=?";
        	PreparedStatement pstmt = con.prepareStatement(sql);
        	pstmt.setString(1,id);
            ResultSet rs = pstmt.executeQuery();
	        System.out.println(sql);
        
	    	log = new Log();

	    	while(rs.next()){
            	log = new Log();
    			String name =rs.getString(2);
        		String des =rs.getString(3);
        		String data =rs.getString(4);
        		double size =rs.getDouble(5);
        		String type =rs.getString(6);
        		log.setId(id);
        		log.setName(name);
        		log.setDescription(des);
        		log.setData(data);
        		log.setSize(size);
        		log.setType(type);
        		System.out.println(log);
        	}
	 	}catch (Exception e) { 
	 		e.printStackTrace();
	 	}
		return log;
	}
	
	public void update(String id, String name, String description, String data) {
		Connection con = DBConnection.getConnection();
		String sql = "update logs set name=?, description=?, data=? where id=?";
		System.out.println("before update");
		System.out.println(id + name + description + data);
        try {
        	PreparedStatement pstmt = con.prepareStatement(sql);
        	pstmt = con.prepareStatement(sql);
        	pstmt.setString(4,id);
        	pstmt.setString(1,name);
        	pstmt.setString(2,description);
        	pstmt.setString(3,data);
        	pstmt.executeUpdate();
        	
        	System.out.println("after update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	//For Text
	public boolean upload(String name, String description, String data) {
		try { 
			Connection con = DBConnection.getConnection();
	        String sql = "insert into logs (name,description,data,internalID) values(?,?,?,?)"; 
	        
	        PreparedStatement ps = con.prepareStatement(sql);
	
	        ps.setString(1, name);
	        ps.setString(2, description);
	        ps.setString(3, data);
	        ps.setLong(4, System.currentTimeMillis());
	        ps.executeUpdate();
	 	}catch (Exception e) { 
	 		e.printStackTrace();
	 		return false;
        }
		return true;
	}
	
	//For Audio, Video, Image
	public boolean upload(String name, String description, String data, double size, String type) { 
		Connection con = null;
		try { 
			con = DBConnection.getConnection();
	        String sql = "insert into logs (name,description,data, size, type,internalID) values(?,?,?,?,?,?)"; 
	        
	        PreparedStatement ps = con.prepareStatement(sql);
	
	        ps.setString(1, name);
	        ps.setString(2, description);
	        ps.setString(3, data);
	        ps.setDouble(4, size);
            ps.setString(5, type);
            ps.setLong(6, System.currentTimeMillis());
	        ps.executeUpdate();
	 	}catch (Exception e) { 
	 		e.printStackTrace();
	 		return false;
        }finally {
            DBConnection.closeAll(con);
        }
		return true;
	}
	
	public void delete(String id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DBConnection.getConnection();
            String sql = "delete from logs where id=?";
            statement = connection.prepareStatement(sql);
            System.out.println(sql);
            statement.setString(1,id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeAll(connection);
        }
    }
	
}
