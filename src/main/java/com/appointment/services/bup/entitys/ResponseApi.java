package com.appointment.services.bup.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ResponseApi {

    private Integer status;
    private String message;
    private Object result;

    public static ResponseApi createOkResponse(String message,Object result){
        return new ResponseApi(HttpStatus.OK.value(), message, result);
    }

    public static ResponseApi createErrResponse(Integer status,String message,Object result){
        return new ResponseApi(status, message, result);
    }



}
