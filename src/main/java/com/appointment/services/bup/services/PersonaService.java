package com.appointment.services.bup.services;

import com.appointment.services.bup.entitys.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService {

    List<Persona> findAllPersonas();

    Persona savePersona(Persona persona);

    Persona findPersonaByNumberAndRef(String number, String ref);

    Persona findPersonaByUserAndPass(String user, String pass);

    Persona findPersonaByNumber(String numero);
}