/**
 * 
 */
package com.demo.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * @author dorak
 *
 */
@Path("/hello")
public class Hello {
	
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello(){
		  return "Hello from Mindmajix";
	  }

	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLtHello(){
		  return "<?xml version=\"1.0\" ?>"+"<hello> Hello from Mindmajix </hello>";
	  }
	  
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello(){
		  return "<html>"
		  		+ "<body>"
		  		+ "<h3> Hello from Mindmajix </h3>"
		  		+ "</body>"
		  		+ "</html>";
	  }
	
}
