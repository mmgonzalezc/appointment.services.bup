package com.appointment.services.bup.repositories;

import com.appointment.services.bup.entitys.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario,String>{
    @Query("{numero: ?0, referenciado: ?1}")
    Usuario findUsuarioByNumberAndRef(String numero, String referenciado);


    @Query("{usuario: ?0, clave: ?1}")
    Usuario findUsuarioByUserAndPass(String usuario, String clave);

}

