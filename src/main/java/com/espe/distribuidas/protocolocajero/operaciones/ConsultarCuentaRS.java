/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.operaciones;

import com.espe.distribuidas.protocolocajero.pc.Cuerpo;

/**
 *
 * @author david
 */
public class ConsultarCuentaRS implements Cuerpo {

    public static final String CORRECTO = "OK";
    public static final String INCORRECTO = "NO";

    private String message;
    private String cedula;
    private String nombre;
    private String tipo;
    private double saldoActual;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.message).append("_");
        sb.append(this.cedula).append("_");
        sb.append(this.nombre).append("_");
        sb.append(this.tipo).append("_");
        sb.append(this.saldoActual);
        return sb.toString();
    }

}
