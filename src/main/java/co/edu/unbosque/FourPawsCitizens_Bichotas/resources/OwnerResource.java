package co.edu.unbosque.FourPawsCitizens_Bichotas.resources;

import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.filters.Logged;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.User;
import co.edu.unbosque.FourPawsCitizens_Bichotas.services.UserAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/owners")
public class OwnerResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(User user) {

        user.setRole("owner");

        Optional<User> persistedUser = new UserAppService().createUser(user);

        if (persistedUser.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedUser.get())
                    .build();
        } else {
            return Response.serverError()
                    .entity("Owner user could not be created")
                    .build();
        }


    }

    @Logged
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response modify(@HeaderParam("role") String role, User user){
        user.setRole(role);

        return Response.ok().entity("Role changed").build();
    }

    @Logged
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(@HeaderParam("role") String role) {

        // If role doesn't match
        if (!"owner".equals(role))
            return Response.status(Response.Status.FORBIDDEN)
                    .entity("Role " + role + " cannot access to this method")
                    .build();

        return Response.ok()
                .entity("Hello, World, " + role + "!")
                .build();

    }

}