/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author david
 */
public class Mensaje {
    public static final String AUTENTIC_USER = "AUTENTISIN";
    public static final String CONSULTAR_CUENTA = "VERIFICARC";
    public static final String DEPOSITO = "TRADEPOSIT ";
    public static final String  RETIRO = "TRARETIROV";
    
    
    
    
    public static boolean validaHash (String trama){        
        String cuerpo = trama.substring(85, trama.length());
        String md5HashN = DigestUtils.md5Hex(cuerpo);
        String md5Hash = trama.substring(53, 85);
//        if(md5Hash.equals(md5HashN))
//            System.out.println("correctooooo");
        return md5Hash.equals(md5HashN);
    }
}