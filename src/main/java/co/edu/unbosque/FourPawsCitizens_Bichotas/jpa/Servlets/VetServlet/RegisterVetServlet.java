package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.Servlets.VetServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operacionRegisterVet", value = "/create-vetregister")
public class RegisterVetServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String case_id = request.getParameter("case_ID");
        String pet_microchip = request.getParameter("pet_Microchip");
        String name = request.getParameter("name");
        String pet_species = request.getParameter("pet_Species");

        response.sendRedirect("./HTML/Vet.html");
    }
}
