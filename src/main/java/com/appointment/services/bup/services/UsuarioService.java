package com.appointment.services.bup.services;

import com.appointment.services.bup.entitys.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<Usuario> findAllUsuarios();

    Usuario saveUsuario(Usuario usuario);

    Usuario findUsuarioByNumberAndRef(String number, String ref);

    Usuario findUsuarioByUserAndPass(String user, String pass);

    Usuario findUsuarioByNumber(String numero);
}