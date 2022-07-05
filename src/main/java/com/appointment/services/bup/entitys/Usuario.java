package com.appointment.services.bup.entitys;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
public class Usuario {

    private String tipoAfiliacion;// 1 = free, 2 = vip
    private String inicioAfiliacion;
    private String finAfiliacion;
    private String celular;
    private String nombreUsuario;
    private String correo;
    private String clave;
}
