package com.appointment.services.bup.controllers;

import com.appointment.services.bup.entitys.Usuario;
import com.appointment.services.bup.entitys.ResponseApi;
import com.appointment.services.bup.services.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("${bup.appointment}")
@Api(value = "Usuario", description = "Controller que administra todas las operaciones de los usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @ApiOperation(value = "Guardar usuario", notes = "Servicio que guarda usuario en BD", response = ResponseApi.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Operacion exitosa")
    })
    @PostMapping("${saveUsuario}")
    public ResponseEntity<ResponseApi> saveUsuario(@RequestBody Usuario usuario) {
        log.info("Guardando registro usuario ...");
        Usuario saveUsuario = usuarioService.saveUsuario(usuario);
        return new ResponseEntity<>(new ResponseApi(HttpStatus.CREATED.value(), "Operacion exitosa", saveUsuario), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Usuarios", notes = "Servicio para consulta de usuarios registrados", response = ResponseApi.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operacion exitosa")
    })
    @GetMapping("${findAllUsuarios}")
    public ResponseEntity<ResponseApi> findAllUsuarios() {
        log.info("Usuarios registrados ...");
        List<Usuario> listaUsuarios = usuarioService.findAllUsuarios();
        return new ResponseEntity<>(new ResponseApi(HttpStatus.OK.value(), "Operacion exitosa", listaUsuarios), HttpStatus.OK);
    }
}
