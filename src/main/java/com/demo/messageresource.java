package com.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class messageresource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getmessage() {
		return "hello world";
	}

}
