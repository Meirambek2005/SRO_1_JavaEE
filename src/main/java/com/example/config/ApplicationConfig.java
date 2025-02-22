package com.example.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(com.example.resource.AnimalResource.class);
        resources.add(com.example.resource.ZooResource.class);
        resources.add(com.example.resource.ZooKeeperResource.class);
        return resources;
    }
}