package com.appointment.services.bup.repositories;

import com.appointment.services.bup.entitys.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona,String>{
    @Query("{numero: ?0, referenciado: ?1}")
    Persona findPersonaByNumberAndRef(String numero, String referenciado);


    @Query("{usuario: ?0, clave: ?1}")
    Persona findPersonaByUserAndPass(String usuario, String clave);

}

