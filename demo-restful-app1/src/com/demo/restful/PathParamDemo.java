/**
 * 
 */
package com.demo.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author dorak
 *
 */
@Path("/pathparamdemo")
public class PathParamDemo {
	
	@GET
	@Path("/{username}")
	public Response sayHello(@PathParam("username") String uname){
		String msg = "Welcome Mr."+uname;
		return Response.status(200).entity(msg).build();
	}
	
	@GET
	@Path("/{firstname}/{secondname}/{age}")
	public Response getUserDetails(@PathParam("firstname") String firstName,
			@PathParam("secondname") String secondName,
			@PathParam("age") Integer age){
		String userDetails = "First Name: "+firstName+"<br />Second Name : "+secondName+"<br />Age : " + age;
		return Response.status(200).entity(userDetails).build();
	}
}
