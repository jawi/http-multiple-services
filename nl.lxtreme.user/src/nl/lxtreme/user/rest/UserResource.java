package nl.lxtreme.user.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Nothing special here, just a sample "user" resource.
 */
@Path("/")
public class UserResource {

	@GET
	public Response getUserStuff() {
		return Response.ok("Hello User!").build();
	}

}
