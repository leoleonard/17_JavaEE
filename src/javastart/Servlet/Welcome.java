package javastart.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("Cześć, wiem, że nazywasz się " + firstName + " " + lastName);

        if (age != null) {
            printWriter.println(" Też kiedyś miałem " + age + "lat");
        } else {
            printWriter.print(" Ja też nie lubię chwalić się wiekiem");
        }
    }
}
