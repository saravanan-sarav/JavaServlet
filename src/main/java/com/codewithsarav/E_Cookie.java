package com.codewithsarav;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class E_Cookie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cookieName = req.getParameter("cookieName");
        Cookie cookie = new Cookie("cookieName",cookieName);
        resp.addCookie(cookie);
        resp.sendRedirect("cookieTrackingget");
    }
}
