package br.com.ciabfebraban.ws;

import java.io.IOException;
import java.util.ArrayList;

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
import com.cloudant.client.api.views.Key;
import com.cloudant.client.api.views.ViewResponse;

import br.com.ciabfebraban.conn.MyUtils;
import br.com.ciabfebraban.model.Expense;

@Path("/expense")
public class ExpenseWS {

	@Context HttpServletRequest request;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getExpenses() {
		Database conn = MyUtils.getStoredConnection(request);
		
		ViewResponse<String, Expense> listObject = null;
		
		try {
			listObject = conn.getViewRequestBuilder("expense", "expense-view")
							.newRequest(Key.Type.STRING, Expense.class)
							.limit(50)
							.includeDocs(true)
							.build()
							.getResponse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Expense> expenses = new ArrayList<Expense>();
		
		if(listObject != null) {
			for(Expense expense : listObject.getValues()) {
				expenses.add(expense);
			}
		}
		
		return Response.status(200).entity(expenses).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertExpense(Expense expense) {
		Database conn = MyUtils.getStoredConnection(request);
		conn.save(expense);	
		return Response.status(200).entity("{\"response\": \"ok\"}").build();
	}
	
}
