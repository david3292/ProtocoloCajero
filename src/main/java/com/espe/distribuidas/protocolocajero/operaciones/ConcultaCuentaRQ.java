/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.operaciones;

import com.espe.distribuidas.protocolocajero.Cuerpo;

/**
 *
 * @author david
 */
public class ConcultaCuentaRQ implements Cuerpo{

    public static final String TIPO_AHORRO = "_AHO";
    public static final String TIPO_CORRIENTE = "_COR";
    
    public String cuenta;
    public String tipo;

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }        
    
    @Override
    public String asTexto() {
        return this.cuenta + this.tipo;
    }
    
}
