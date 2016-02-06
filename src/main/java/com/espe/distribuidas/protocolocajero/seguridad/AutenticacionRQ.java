/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.seguridad;

import com.espe.distribuidas.protocolocajero.pc.Cuerpo;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author david
 */
public class AutenticacionRQ implements Cuerpo{

    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = StringUtils.rightPad(usuario, 10);
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = StringUtils.rightPad(clave, 10);
    }
    
    @Override
    public String asTexto() {
        return this.usuario + this.clave;
    }
    
}
