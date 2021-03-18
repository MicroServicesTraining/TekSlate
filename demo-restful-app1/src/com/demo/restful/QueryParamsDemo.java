/**
 * 
 */
package com.demo.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author dorak
 *
 */
@Path("/qparamdemo")
public class QueryParamsDemo {
	
	@GET
	@Path("/getvalue")
	public Response getQparam(@QueryParam("msg") String message){
		String respMsg = message;
		return Response.status(Status.OK).entity(respMsg).build();
	}

}
