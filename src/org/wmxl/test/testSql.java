package org.wmxl.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.wmxl.dao.DBConnection;
import org.wmxl.model.Log;

public class testSql {
	public static void main(String[] args) {
		Log log = null;
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
        		System.out.println(log);
        	}
		 }catch (Exception e) { 
        	e.printStackTrace();
        }
		
		System.out.println("---------------------");
		
		String id = "6";
		log = null;
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
		
		
		System.out.println("---------update------------");
		id = "6";
		Connection con = DBConnection.getConnection();
		String sql = "update logs set name=?, description=?, data=? where id=?";
        try {
        	PreparedStatement pstmt = con.prepareStatement(sql);
        	pstmt = con.prepareStatement(sql);
        	pstmt.setString(4,id);
        	pstmt.setString(1,"old name");
        	pstmt.setString(2,"old description");
        	pstmt.setString(3,"old data");
        	pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
