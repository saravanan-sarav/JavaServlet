package com.codewithsarav;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class D_SessionTrackingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String getName = session.getAttribute("name").toString();
        PrintWriter printWriter = resp.getWriter();

        printWriter.write("<p>User Name is "+getName+"</p>");


    }
}
