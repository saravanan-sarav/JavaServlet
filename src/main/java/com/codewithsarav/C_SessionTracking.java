package com.codewithsarav;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class C_SessionTracking extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        resp.sendRedirect("sessiontrackingservlet");
    }
}
