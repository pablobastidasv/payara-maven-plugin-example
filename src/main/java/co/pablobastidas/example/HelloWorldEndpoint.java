package co.pablobastidas.example;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/hello")
public class HelloWorldEndpoint {

	@Inject
    @ConfigProperty(name = "APP_NAME", defaultValue = "payara-micro")
	private String name;

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello from " + name + "!").build();
	}
}