package br.com.ciabfebraban.ws;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudant.client.api.Database;

import br.com.ciabfebraban.conn.MyUtils;
import br.com.ciabfebraban.model.Sale;



@Path("/sale")
public class SaleWS {


	@Context HttpServletRequest request;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{id}")
//	@PathParam("id") String id
	public Response getEmploymentByID() {
		return Response.status(200).entity("{\"response\": \"show\"}").build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertSale(Sale sale) {
		Database conn = MyUtils.getStoredConnection(request);
		com.cloudant.client.api.model.Response response = conn.save(sale);
	
		System.out.println("_id" + response.getId());
		
		return Response.status(200).entity("{\"response\": \"ok\"}").build();
	}
	
}
