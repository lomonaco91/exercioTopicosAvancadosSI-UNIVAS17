package service;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculadoraService {
	
	@GET
	//@Path("/sum/{first}/{second}") PATH
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@QueryParam("first") int a, @QueryParam("second") int b);
	
	@POST
	@Path("subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result subtract(@FormParam("first") int a, @FormParam("second") int b);
	

}
