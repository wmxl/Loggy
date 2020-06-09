package org.wmxl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.wmxl.dao.LogDao;

public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
        String id = req.getParameter("id");
        LogDao dao = new LogDao();
        dao.delete(id);
        resp.sendRedirect("find");	
//        req.getRequestDispatcher("/find").forward(req, resp);
    }
}
