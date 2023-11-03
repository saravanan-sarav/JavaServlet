package com.codewithsarav;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class B_SquareNumbers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("square number"));

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<html>");
        printWriter.write("<head>");
        printWriter.write("<title>Servlet Add</title>");
        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("<p>Add of two number is : " + (num1 * num1));
        printWriter.write("</body>");
        printWriter.write("</html>");

    }
}
