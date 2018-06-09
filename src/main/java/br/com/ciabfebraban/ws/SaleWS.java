package br.com.ciabfebraban.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sale")
public class SaleWS {

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{id}")
//	@PathParam("id") String id
	public Response getEmploymentByID() {
		return Response.status(200).entity("show").build();
	}
	
}
