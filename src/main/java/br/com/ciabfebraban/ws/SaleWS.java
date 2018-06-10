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
import br.com.ciabfebraban.model.Sale;

@Path("/sale")
public class SaleWS {

	@Context HttpServletRequest request;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmploymentByID() {
		return Response.status(200).entity("{\"response\": \"show\"}").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Response getSaleByName(@PathParam("name") String name) {
		Database conn = MyUtils.getStoredConnection(request);
		Search searchConn = conn.search("sale" + "/" + "nameSearch");
		System.out.println("" + name);
		SearchResult<Sale> rslt = searchConn.includeDocs(true).querySearchResult("name:'" + name + "'", Sale.class);
		
		ArrayList<Sale> sales = new ArrayList<Sale>();
		
		for(SearchResult<Sale>.SearchResultRow sale : rslt.getRows()) {
			sales.add(sale.getDoc());
		}
		
		return Response.status(200).entity(sales).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertSale(Sale sale) {
		Database conn = MyUtils.getStoredConnection(request);
		conn.save(sale);	
		return Response.status(200).entity("{\"response\": \"ok\"}").build();
	}
}
