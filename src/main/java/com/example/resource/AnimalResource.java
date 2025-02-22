package com.example.resource;

import com.example.model.Animal;
import com.example.util.LogUtil;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/animals")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AnimalResource {
    private static List<Animal> animals = new ArrayList<>();

    @GET
    public List<Animal> getAllAnimals() {
        LogUtil.log("Fetching all animals. Total count: " + animals.size());
        return animals;
    }

    @POST
    public void addAnimal(Animal animal) {
        animals.add(animal);
        LogUtil.log("Added new animal: " + animal.toString());
    }

    @GET
    @Path("/{id}")
    public Animal getAnimalById(@PathParam("id") int id) {
        Optional<Animal> animal = animals.stream().filter(a -> a.getId() == id).findFirst();
        if (animal.isPresent()) {
            LogUtil.log("Found animal with ID: " + id);
            return animal.get();
        } else {
            LogUtil.logError("Animal with ID " + id + " not found", new NotFoundException("Animal not found"));
            throw new NotFoundException("Animal not found");
        }
    }
}
