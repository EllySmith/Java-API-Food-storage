package com.example.foodmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ServerPortLogger {

    private final Environment environment;

    @Autowired
    public ServerPortLogger(Environment environment) {
        this.environment = environment;
    }

    public void logServerPort() {
        String serverPort = environment.getProperty("server.port", "Not Defined");
        System.out.println("Server is running on port: " + serverPort);
    }
}
