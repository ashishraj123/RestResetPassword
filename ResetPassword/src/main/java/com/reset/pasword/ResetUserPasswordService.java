package com.reset.pasword;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

 
@Path("/userrequest")
public class ResetUserPasswordService {
 
	UserDetailDao UserDetailDao=new UserDetailDao();
	
	 @POST
	 @Path("/reset")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.TEXT_PLAIN)
	public String resetPassword(UserInput userInput) {
		 return UserDetailDao.resetPassword(userInput);
	}
 
}