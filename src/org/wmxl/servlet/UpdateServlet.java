package org.wmxl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.wmxl.dao.LogDao;
import org.wmxl.model.Log;

public class UpdateServlet extends HttpServlet {
	LogDao dao = new LogDao();
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("UPDAE POST");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
        String description = req.getParameter("description");
        String data = req.getParameter("data");
        System.out.println(name +" " + description);
        LogDao dao = new LogDao();
        dao.update(id, name, description, data);
        resp.sendRedirect("find");	
    }
	
}
