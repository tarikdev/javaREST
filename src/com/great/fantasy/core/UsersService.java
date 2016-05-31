package com.great.fantasy.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/UsersService")
public class UsersService {

	 @GET
	 @Produces("application/json")
	public Response getUser() throws JSONException
	{
		
		JSONObject user = new JSONObject();
		user.put("username", "terza");
		user.put("password", "test");
		
		return Response.status(200).entity(user).build();
		
	}
	
}
