package io.github.liuziyuan.quarkus.easyretrofit.integration.sample;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api")
@ApplicationScoped
public class BackendApiResource {

    @GET()
    @Path("/hello")
    public String hello() {
        return "hello retrofit baseApi";
    }
}
