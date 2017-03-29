package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kyriakos Chatzikyriakou on 29/03/2017.
 */

@WebServlet(name = "hello", urlPatterns = "/")
public class RentalCarsServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.getWriter().write("Hello there! Please visit /main.RentalCars/api/cars/all");
    }
}
