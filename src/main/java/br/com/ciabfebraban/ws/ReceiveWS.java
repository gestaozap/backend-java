package br.com.ciabfebraban.ws;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.Search;
import com.cloudant.client.api.model.SearchResult;

import br.com.ciabfebraban.conn.MyUtils;
import br.com.ciabfebraban.model.Receive;

@Path("/receive")
public class ReceiveWS {

	@Context HttpServletRequest request;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Response getReceiveByName(@PathParam("name") String name) {
		Database conn = MyUtils.getStoredConnection(request);
		Search searchConn = conn.search("receive" + "/" + "nameSearch");
		
		SearchResult<Receive> rslt = searchConn.includeDocs(true).querySearchResult("name:'" + name + "'", Receive.class);
		
		ArrayList<Receive> receives = new ArrayList<Receive>();
		
		for(SearchResult<Receive>.SearchResultRow receive : rslt.getRows()) {
			receives.add(receive.getDoc());
		}
		
		return Response.status(200).entity(receives).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertReceive(Receive receive) {
		Database conn = MyUtils.getStoredConnection(request);
		conn.save(receive);	
		return Response.status(200).entity("{\"response\": \"ok\"}").build();
	}
	
}
