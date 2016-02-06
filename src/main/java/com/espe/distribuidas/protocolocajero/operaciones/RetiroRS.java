/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.operaciones;

import com.espe.distribuidas.protocolocajero.pc.Cuerpo;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class RetiroRS implements Cuerpo{

    public static final String DEPOSITO_EXITOSO = "00";
    public static final String CUENTA_NO_EXISTE = "01";
    public static final String DIFERENTE_TIPO_CUENTA = "02";
    public static final String CLIENTE_NO_EXISTE = "03";
    public static final String CUENTA_NO_ACTIVA = "04";
    public static final String CUENTA_NO_PERTENECE_AL_CLIENTE = "05";
    public static final String FONDOS_INSUFICIENTES = "06";
    
    
    private String resultado;
    private double saldoActual;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
        sb.append(this.resultado);
        if(this.resultado.equals(DepositoRS.DEPOSITO_EXITOSO)){
            sb.append(StringUtils.leftPad(Double.toString(this.saldoActual), 10,"0"));
        }
        
        return sb.toString();
    }
    
}
