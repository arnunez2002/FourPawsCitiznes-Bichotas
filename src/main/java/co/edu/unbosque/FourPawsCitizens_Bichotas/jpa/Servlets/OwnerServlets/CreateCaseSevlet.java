package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.Servlets.OwnerServlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operacionCrearCase", value = "/create-case")
public class CreateCaseSevlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Long case_id = request.getParameter("case_ID");
        String pet_microchip = request.getParameter("pet_Microchip");
        String pet_name = request.getParameter("pet_name");
        String pet_species = request.getParameter("pet_Species");
        String pet_race = request.getParameter("pet_Race");


        response.sendRedirect("./HTML/Owner.html");
    }
}
