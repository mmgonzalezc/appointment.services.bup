package com.appointment.services.bup.services.Impl;

import com.appointment.services.bup.entitys.Usuario;
import com.appointment.services.bup.repositories.UsuarioRepository;
import com.appointment.services.bup.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findUsuarioByNumberAndRef(String number, String ref) {
        return usuarioRepository.findUsuarioByNumberAndRef(number,ref);
    }

    @Override
    public Usuario findUsuarioByUserAndPass(String user, String pass) {
        return usuarioRepository.findUsuarioByUserAndPass(user,pass);
    }
    
    public Usuario findUsuarioByNumber(String numero) {
        return usuarioRepository.findById(numero).orElse(null);
    }
}
