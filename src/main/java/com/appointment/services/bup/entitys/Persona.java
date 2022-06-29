package com.appointment.services.bup.entitys;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Usuario")
public class Persona {

    private String afiliacion;// 1 = free, 2 = vip
    private String afilacionInicio;
    private String afiliacionFin;
    private String celular;
    private String nombreUsuario;
    private String correo;
    private String clave;


}
