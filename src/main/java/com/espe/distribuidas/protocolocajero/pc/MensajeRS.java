/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.pc;

/**
 *
 * @author david
 */
public class MensajeRS {

    private static final String TIPO_MENSAJE = "RS";

    private Cabecera cabecera;
    private Cuerpo cuerpo;

    public MensajeRS(String originador, String idMensaje) {
        this.cabecera = new Cabecera(MensajeRS.TIPO_MENSAJE, originador, idMensaje);
    }

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String asTexto() {
        Integer longitud = this.cuerpo.asTexto().length();
        this.cabecera.setLongitudCuerpo(longitud.toString());
        this.cabecera.setVerificacion(this.cuerpo.asTexto());
        return this.cabecera.asTexto() + this.cuerpo.asTexto();
    }
}
