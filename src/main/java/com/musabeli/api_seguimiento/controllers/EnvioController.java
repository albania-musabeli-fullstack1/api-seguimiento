package com.musabeli.api_seguimiento.controllers;

import com.musabeli.api_seguimiento.models.Envio;
import com.musabeli.api_seguimiento.services.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @GetMapping("envio/getAllEnvios")
    public ResponseEntity<List<Envio>> getAllEnvios(){
        return ResponseEntity.status(HttpStatus.OK).body(this.envioService.getAllEnvios());
    }

    @GetMapping("envio/{id}")
    public ResponseEntity<Object> getEnvioById(@PathVariable int id){
        Object objeto = this.envioService.getEnvioById(id);

        if (objeto instanceof Envio){
            return ResponseEntity.status(HttpStatus.OK).body(objeto);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(objeto);
        }
    }
}
