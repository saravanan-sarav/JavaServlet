package com.codewithsarav;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class F_CookieTracking extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String getCookie ="";
        PrintWriter printWriter = resp.getWriter();
        Cookie cookie[] = req.getCookies();
        for(Cookie cookie1:cookie){
            getCookie = cookie1.getValue();
            printWriter.write("<p>User Name is "+getCookie+"</p>");
        }

    }

}
