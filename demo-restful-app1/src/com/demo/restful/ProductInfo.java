/**
 * 
 */
package com.demo.restful;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author dorak
 *
 */
@Path("/product")
public class ProductInfo {
	
	@POST
	@Path("/info")
	public Response getInfo(@FormParam("name") String pname, @FormParam("price") Double pprice){
		return Response.status(Status.OK).entity("Product Name: "+pname+"<br />Product Price : "+pprice).build();
	}

}
