package com.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresource")
public class myresources {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		System.out.println("hello");
		return "GOT IT!";
	}
}
