package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operacionEleccion", value = "/create-owner")
public class operacionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");


        String role = request.getParameter("role");
        String parametro = role.toUpperCase();

        if(parametro.equals("PROPETARIO")) {
            response.sendRedirect("./HTML/Owner.html");
        }else if(parametro.equals("VETERINARIA")){
            response.sendRedirect("./HTML/Vet.html");

        }else if(parametro.equals("FUNCIONARIO")){
            response.sendRedirect("./HTML/Fun.html");
        }





        response.sendRedirect("./author.jsp");
    }

}
