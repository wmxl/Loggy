package org.wmxl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.wmxl.dao.LogDao;
import org.wmxl.model.Log;
import org.wmxl.service.LogService;

public class UpdateServlet extends HttpServlet {
	LogService logService = new LogService();
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("UPDAE POST");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
        String description = req.getParameter("description");
        String data = req.getParameter("data");

        logService.update(id, name, description, data);
        resp.sendRedirect("find");	
    }
	
}
