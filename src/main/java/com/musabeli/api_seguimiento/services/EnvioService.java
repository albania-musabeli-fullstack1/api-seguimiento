package com.musabeli.api_seguimiento.services;

import com.musabeli.api_seguimiento.models.Envio;
import com.musabeli.api_seguimiento.models.MensajeError;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EnvioService {

    private List<Envio> envioList = new ArrayList<>();

    public EnvioService(){
        this.envioList.add(new Envio(1, "ASD4567PE", "Albania Musabeli", "Sofia Musabeli", "Chile", "Francia", LocalDateTime.of(2025,3,29,13,30,0), "En camino a Destino", "Aeropuerto Internacional Arturo Merino Benitez"));
        this.envioList.add(new Envio(1, "VFE4565NY", "Felipe González", "Alice Smith", "Chile", "Estados Unidos", LocalDateTime.of(2025,3,29,14,5,0), "En Aduanas", "Aeropuerto John F. Kennedy"));
        this.envioList.add(new Envio(1, "ASD4567AR", "Verónica Aguilera", "Esteban Alarcón", "Argentina", "Chile", LocalDateTime.of(2025,5,15,17,15,0), "Entregado", "Domicilio del Destinatario"));
        this.envioList.add(new Envio(1, "GHD4987CL", "Antonio Musabeli", "Albania Musabeli", "Japón", "Chile", LocalDateTime.of(2025,4,18,19,40,0), "En camino a Destino", "Aeropuerto Internacional de Haneda"));
        this.envioList.add(new Envio(1, "ASD456789", "Maria Torres", "Danilo Arredondo", "España", "Chile", LocalDateTime.of(2025,2,10,9,0,0), "Retrasado", "Centro de Distribución Bluexpress"));

    }

    /**
     * Método que retorna la lista de envíos
     * @return List<Envios>
     */
    public List<Envio> getAllEnvios(){
        return this.envioList;
    }

    /**
     * Método que retorna un envio de acuerdo a su ID o un objeto de tipo MensajeError
     * @param id
     * @return el objeto Envio si se encuentra, o un objeto MensajeError
     */
    public Object getEnvioById(int id){
        for (Envio envio : this.envioList ){
            if (envio.getId() == id){
                return envio;
            }
        }
        return new MensajeError("El envío con el id " + id + " no está registrado.");
    }
}
