package ch.tranchida.demo;

import jakarta.annotation.Resource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/sampleService")
@Produces("application/json")
public interface SampleService {
    

    @GET
    @Path("/{data}")
    public String test(@PathParam("data") String data);

}
