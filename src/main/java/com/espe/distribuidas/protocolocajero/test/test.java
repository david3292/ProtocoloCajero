/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.protocolocajero.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author david
 */
public class test {
    public static void main(String[] args) {
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss");
        String fecha = sdf.format(d);
        System.out.println("Fecha = " + fecha);
    }
}
