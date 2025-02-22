package com.example.resource;

import com.example.model.Animal;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/animals")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AnimalResource {
    private static List<Animal> animals = new ArrayList<>();

    @GET
    public List<Animal> getAllAnimals() {
        return animals;
    }

    @POST
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @GET
    @Path("/{id}")
    public Animal getAnimalById(@PathParam("id") int id) {
        return animals.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}