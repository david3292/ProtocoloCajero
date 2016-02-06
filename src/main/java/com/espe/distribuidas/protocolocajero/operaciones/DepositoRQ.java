/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.operaciones;

import com.espe.distribuidas.protocolocajero.pc.Cuerpo;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class DepositoRQ implements Cuerpo{
    
    public static final String TIPO_AHORRO = "AHO";
    public static final String TIPO_CORRIENTE = "COR";

    private String cuenta;
    private String tipo;
    private double valor;
    private String documetoDepositante;
    private Date fecha;

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDocumetoDepositante() {
        return documetoDepositante;
    }

    public void setDocumetoDepositante(String documetoDepositante) {
        this.documetoDepositante = documetoDepositante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    @Override
    public String asTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cuenta);
        sb.append("_").append(this.tipo).append("_");
        sb.append(StringUtils.leftPad(Double.toString(this.valor), 10,"0"));
        sb.append("_").append(this.documetoDepositante).append("_");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss");
        sb.append(sdf.format(this.fecha));
        
        return sb.toString();
    }
    
}
