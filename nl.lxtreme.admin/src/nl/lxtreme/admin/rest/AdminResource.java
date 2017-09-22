package nl.lxtreme.admin.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Nothing special here, just a sample "admin" resource.
 */
@Path("/")
public class AdminResource {

	@GET
	public Response getAdminStuff() {
		return Response.ok("Hello Admin!").build();
	}
}
