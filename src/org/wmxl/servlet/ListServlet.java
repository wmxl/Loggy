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

/**
 * Servlet implementation class LoginServlet
 */

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LogDao dao = new LogDao();
		List<Log> logs = dao.getLogList();
		
		PrintWriter out = response.getWriter();
		String page = getHTMLString(logs);
		out.write(page);
	}
	
	public String getHTMLString(List<Log> logs){
		String page = "<h3>Log List</h3><table border=\"1\" cellspacing=\"0\"><tr><th>Name</th>  "
				+ " <th>Description</th>	<th>Data</th>   <th>Size</th>  <th>Type</th>  </tr>";
		
		for(int i = 0; i < logs.size(); i++){
			page += "<tr><td>" + logs.get(i).getName() + "</td>"; 
			page +=  "<td>" + logs.get(i).getDescription() + "</td>"; 
			page +=  "<td>" + logs.get(i).getData() + "</td>" ;
			page +=  "<td>" + logs.get(i).getSize() + "</td>" ;
			page +=  "<td>" + logs.get(i).getType() + "</td></tr>" ;
			
		}
		page += "</table>";
		return page;
	}

}
