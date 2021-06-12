package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.Servlets.VetServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operacionRegisterPet", value = "/create-petregister")
public class RegisterPetServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Long case_id = request.getParameter("case_ID");
        String pet_microchip = request.getParameter("pet_Microchip");
        String pet_name = request.getParameter("pet_name");
        String description = request.getParameter("Description");
        String vet_id = request.getParameter("vet_id");
        String pet_id = request.getParameter("pet_id");

        response.sendRedirect("./HTML/Vet.html");
    }
}
