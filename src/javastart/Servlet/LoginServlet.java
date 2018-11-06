package javastart.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();

//        if (login == null && password != "admin") {
//            printWriter.println("Nieudana próba logowania");
//        } else {
//            printWriter.print("Zalogowano pomyślnie");
//        }

        if ("admin".equals(login) && "admin".equals(password)) {
            response.getWriter().print("Zalogowano pomyśnie");
        } else {
            response.getWriter().print("Niepoprawne dane");
//            response.sendRedirect(""/index.html);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
