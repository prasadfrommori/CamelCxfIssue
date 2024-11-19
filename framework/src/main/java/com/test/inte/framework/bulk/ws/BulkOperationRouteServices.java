
package com.test.inte.framework.bulk.ws;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

public class BulkOperationRouteServices {

	@POST
	@Path("bulkInsert")
	@Consumes("application/json")
	@Produces("application/json")
	public String bulkInsert(String data) {
		return data;
	}
	
}
