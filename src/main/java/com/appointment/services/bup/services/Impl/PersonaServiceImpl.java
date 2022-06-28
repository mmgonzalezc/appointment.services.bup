package com.appointment.services.bup.services.Impl;

import com.appointment.services.bup.entitys.Persona;
import com.appointment.services.bup.repositories.PersonaRepository;
import com.appointment.services.bup.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> findAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona findPersonaByNumberAndRef(String number, String ref) {
        return personaRepository.findPersonaByNumberAndRef(number,ref);
    }

    @Override
    public Persona findPersonaByUserAndPass(String user, String pass) {
        return personaRepository.findPersonaByUserAndPass(user,pass);
    }
    
    public Persona findPersonaByNumber(String numero) {
        return personaRepository.findById(numero).orElse(null);
    }
}
