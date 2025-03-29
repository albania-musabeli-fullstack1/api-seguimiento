package com.musabeli.api_seguimiento.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Envio {
    private int id;
    private String codSeguimiento;
    private String remitente;
    private String destinatario;
    private String paisOrigen;
    private String paisDestino;
    private LocalDateTime fechaEnvio;
    private String estado;
    private String ubicacionActual;
}
