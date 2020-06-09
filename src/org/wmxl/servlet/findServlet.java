package org.wmxl.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.wmxl.dao.LogDao;
import org.wmxl.model.Log;

import java.io.IOException;
import java.util.List;

public class findServlet extends HttpServlet {
    LogDao dao = new LogDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Log> logs = dao.getLogList();
        HttpSession session = req.getSession();
        session.setAttribute("logs",logs);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<User> users =userService.findAll();
//        HttpSession session =req.getSession();
//        session.setAttribute("userlist",users);
//        req.getRequestDispatcher("allUser.jsp").forward(req,resp);
//    }
}