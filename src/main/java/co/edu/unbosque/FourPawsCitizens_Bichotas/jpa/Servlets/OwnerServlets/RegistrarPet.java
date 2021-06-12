package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.Servlets.OwnerServlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operacionCrearPet", value = "/create-pet")
public class RegistrarPet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Long pet_id = request.getParameter("pet_ID");
        String pet_microchip = request.getParameter("pet_Microchip");
        String pet_name = request.getParameter("pet_name");
        String pet_species = request.getParameter("pet_Species");
        String pet_race = request.getParameter("pet_Race");
        String pet_country = request.getParameter("pet_Country");
        String pet_sex = request.getParameter("pet_sex");
        String pet_owner = request.getParameter("pet_Owner");



        response.sendRedirect("./HTML/Owner.html");
    }

}
