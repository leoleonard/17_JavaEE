package javastart.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String number1 = request.getParameter("n1");
        String number2 = request.getParameter("n2");


        Double n1 = Double.valueOf(number1);
        Double n2 = Double.valueOf(number2);

        System.out.println("Dodawanie: " + (n1 + n2));
        System.out.println("Odejmowanie: " + (n1 - n2));
        System.out.println("Mnożenie: " + (n1 * n2));
//        String number1 = request.getParameter("2");
//        String number2 = request.getParameter("5");
//        System.out.println(number1 + number2);


    }
}
