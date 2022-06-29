package com.appointment.services.bup.controllers;

import com.appointment.services.bup.entitys.Persona;
import com.appointment.services.bup.entitys.ResponseApi;
import com.appointment.services.bup.services.PersonaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("${bup.appointment}")
//@Api(value = "Persona", description = "Controller que administra todas las operaciones de las personas")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    @ApiOperation(value = "Guarda Persona", notes = "Servicio que guarda persona en BD", response = ResponseApi.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Operacion exitosa")
    })
    @PostMapping("${savePersona}")
    public ResponseEntity<ResponseApi> savePersona(@RequestBody Persona persona) {
        log.info("Guardando registro usuario ...");
        Persona savePersona = personaService.savePersona(persona);
        return new ResponseEntity<>(new ResponseApi(HttpStatus.CREATED.value(), "Operacion exitosa", savePersona), HttpStatus.CREATED);
    }
    /**
     * Valida si es invitado
     */
    @GetMapping("${findPersonaByCelular}")
    public ResponseEntity<ResponseApi> validaInvitado(@PathVariable String celular){
    log.info("Buscando invitado");
    log.info("Ir a consultar bd para ir a ver si fue invitado");
    return new ResponseEntity<>(new ResponseApi(HttpStatus.OK.value(), "Operacion exitosa", savePersona), HttpStatus.CREATED);

    }
}
