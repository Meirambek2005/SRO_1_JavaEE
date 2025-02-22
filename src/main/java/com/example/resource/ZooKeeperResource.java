package com.example.resource;

import com.example.model.ZooKeeper;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/zookeepers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ZooKeeperResource {
    private static List<ZooKeeper> zooKeepers = new ArrayList<>();

    @GET
    public List<ZooKeeper> getAllZooKeepers() {
        return zooKeepers;
    }

    @POST
    public void addZooKeeper(ZooKeeper zooKeeper) {
        zooKeepers.add(zooKeeper);
    }

    @GET
    @Path("/{id}")
    public ZooKeeper getZooKeeperById(@PathParam("id") int id) {
        return zooKeepers.stream().filter(z -> z.getId() == id).findFirst().orElse(null);
    }
}