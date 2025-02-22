package com.example.resource;

import com.example.model.Zoo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/zoos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ZooResource {
    private static List<Zoo> zoos = new ArrayList<>();

    @GET
    public List<Zoo> getAllZoos() {
        return zoos;
    }

    @POST
    public void addZoo(Zoo zoo) {
        zoos.add(zoo);
    }

    @GET
    @Path("/{id}")
    public Zoo getZooById(@PathParam("id") int id) {
        return zoos.stream().filter(z -> z.getId() == id).findFirst().orElse(null);
    }
}
