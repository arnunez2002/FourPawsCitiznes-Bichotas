package co.edu.unbosque.FourPawsCitizens_Bichotas.resources;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.PetCase;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("Cases")
public class CasesResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<PetCase> cases = new ArrayList<PetCase>();
        cases.add(new PetCase("h", "h", null));
        cases.add(new PetCase("h", "h", null));
        cases.add(new PetCase("h", "h", null));


        return Response.ok()
                .entity(cases)
                .build();
    }

    @GET
    @Path("/type/{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listaSexo(@PathParam("type") String type) {

        List<PetCase> cases = new ArrayList<PetCase>();
        cases.add(new PetCase("h", "h", null));
        cases.add(new PetCase("h", "h", null));
        cases.add(new PetCase("h", "h", null));
        List<PetCase> cases2 = new ArrayList<PetCase>();
        for (int i = 0; i < cases.size(); i++) {
            if (cases.get(i).getType().equals(type)) {
                cases2.add(cases.get(i));
            }
        }

        return Response.ok()
                .entity(cases2)
                .build();
    }

    @GET
    @Path("/case")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listaSexo() {

        List<PetCase> cases = new ArrayList<PetCase>();
        cases.add(new PetCase("h", "h", null));
        cases.add(new PetCase("h", "h", null));
        cases.add(new PetCase("h", "h", null));


        return Response.ok()
                .entity(cases)
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PetCase aCase) {

        aCase.setCreated_ad("hoy");

        return Response.status(Response.Status.CREATED)
                .entity(aCase)
                .build();
    }
}