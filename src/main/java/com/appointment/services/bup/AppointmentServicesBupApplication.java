package com.appointment.services.bup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:api.properties")
public class AppointmentServicesBupApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppointmentServicesBupApplication.class, args);
    }

}
