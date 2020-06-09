package org.wmxl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wmxl.dao.LogDao;
import org.wmxl.model.Log;
import org.wmxl.model.VideoLog;
import org.wmxl.service.LogService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {	
	
	LogService logService = new LogService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name, description, data, type, logType;
		double size;
		name = request.getParameter("name");
		description = request.getParameter("description");
		data = request.getParameter("data");
		
		String s = request.getParameter("size");
		if(s != "" && s != null)
			size = Double.valueOf(s.toString());
		else 
			size = 0.0;
		type = request.getParameter("type");
		logType = request.getParameter("logType");
		
		boolean res;
		if(logType == "TextLog"){
			res = logService.upload(name, description, data);		
		}else{
			res = logService.upload(name, description, data, size, type);	
		}

		if(res){
			response.sendRedirect("find");	
		}else{
			response.sendRedirect("upload.jsp");
		}
		
	}

}
