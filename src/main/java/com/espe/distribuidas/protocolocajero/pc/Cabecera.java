/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.pc;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class Cabecera {

    private String tipoMensaje;
    private String originador;
    private String fecha;
    private String idMensaje;
    private String longitudCuerpo;
    private String verificacion;

    public Cabecera(String tipoMensaje, String originador, String idMensaje) {
        this.tipoMensaje = tipoMensaje;
        this.originador = originador;
        this.idMensaje = idMensaje;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        this.fecha = sdf.format(new Date());
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getOriginador() {
        return originador;
    }

    public void setOriginador(String originador) {
        this.originador = StringUtils.leftPad(originador, 20, "0");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(String idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getLongitudCuerpo() {
        return longitudCuerpo;
    }

    public void setLongitudCuerpo(String longitudCuerpo) {
        this.longitudCuerpo = StringUtils.leftPad(longitudCuerpo, 4, "0");
    }

    public String getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(String verificacion) {
        //System.out.println(verificacion);
        String rs1 = DigestUtils.md5Hex(verificacion);
        this.verificacion = rs1;
    }

    @Override
    public String toString() {
        return "Cabecera{" + "tipoMensaje=" + tipoMensaje + ", originador=" + originador + ", fecha=" + fecha + ", idMensaje=" + idMensaje + ", longitudCuerpo=" + longitudCuerpo + ", verificacion=" + verificacion + '}';
    }

    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tipoMensaje);
        setOriginador(this.originador);
        sb.append(this.originador);
        sb.append(this.fecha);
        this.setIdMensaje(idMensaje);
        sb.append(this.idMensaje);
        sb.append(this.getLongitudCuerpo());
        sb.append(this.getVerificacion());
        return sb.toString();

    }

}
