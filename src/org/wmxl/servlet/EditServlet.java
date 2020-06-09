package org.wmxl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.wmxl.dao.LogDao;
import org.wmxl.model.Log;

public class EditServlet extends HttpServlet {
	LogDao dao = new LogDao();
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("EDIT GET");

		String id = req.getParameter("id");
		
		System.out.println(id);

		Log log = dao.getLog(id);
        HttpSession session = req.getSession();
        session.setAttribute("log",log);
        System.out.println(log);
        req.getRequestDispatcher("edit.jsp").forward(req,resp);
    }	
}
