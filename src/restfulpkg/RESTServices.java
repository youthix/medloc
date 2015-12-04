package restfulpkg;

import helperClasses.ServiceDelegate;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entities.BootRequest;
import entities.Bootstrap;
import entities.Preferences;
import entities.Query;
import entities.RequestParam;
import entities.ResponseVO;
import entities.UserInfo;

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
	
	@POST
	@Path("/register-user")	
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerUser(UserInfo userInfo) {
		
		System.out.println("User is >>"+userInfo.toString());		
		return Response.status(Response.Status.OK).entity("User is successfully registered !"). build();
		
	}
	
	@POST
	@Path("/boot")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Bootstrap getBootstrapConfig(BootRequest bootRequest) {
		
		System.out.println("Application is booting ... >>");	
		return serviceDelegateObj.getBootstrap();
		
	}
	
	@POST
	@Path("/send-query")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response sendQuery(Query query) {
		
		System.out.println("Query sent is... >>"+query.toString());	
		return Response.status(Response.Status.OK).entity("Thanks for contacting us ! We will get back to you soon !"). build();
		
	}
	
	@POST
	@Path("/set-pref")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response setPreferences(Preferences preferences) {
		
		System.out.println("Preferences sent is... >>"+preferences.toString());	
		return Response.status(Response.Status.OK).entity("Preferences set !!"). build();
		
	}

}
