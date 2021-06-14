package co.edu.unbosque.FourPawsCitizens_Bichotas.resources;

import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.Case;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Case/{pet_id}/case/{case_id}")
public class CaseResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("pet_id") Integer pet_id, @PathParam("case_id") Integer case_id, Case aCase) {

        return Response.ok()
                .entity(aCase)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("pet_id") Integer pet_id, @PathParam("case_id") Integer case_id) {

        return Response.noContent()
                .build();
    }
}
