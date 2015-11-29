package restfulpkg;

import helperClasses.ServiceDelegate;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.RequestParam;
import entities.ResponseVO;

@Path("pharmacy")
public class RESTServices {
	
	ServiceDelegate serviceDelegateObj ;

	public RESTServices() {
		 serviceDelegateObj = new ServiceDelegate();
	}

/*	@POST
	@Path("/validateUser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public UserInfo validateUser(UserInfo userInfoObj) {

		//ServiceDelegate serviceDelegateObj = new ServiceDelegate();
		return serviceDelegateObj.validateUser(userInfoObj);

		//ServiceDelegate.callProcedure();
	}
	
	@POST
	@Path("/getAllUsers")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public UserList getAllUsers() {

		//ServiceDelegate serviceDelegateObj = new ServiceDelegate();
		return serviceDelegateObj.getAllUsers();
	}*/

	@POST
	@Path("/getData")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseVO getData(RequestParam requestParam) {

		//ServiceDelegate serviceDelegateObj = new ServiceDelegate();
		return serviceDelegateObj.getData(requestParam);
	}
	
	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)	
	public String helloWorld() {
		return "Hello , Kya hukm hai mere Aaka!";
	}
	
	@POST
	@Path("/getLocations")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseVO getLocations(RequestParam requestParam) {

		//ServiceDelegate serviceDelegateObj = new ServiceDelegate();
		return serviceDelegateObj.getLocations(requestParam);
	}

}
