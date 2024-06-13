/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agroa3;

/**
 *
 * @author 82417627
 */
public class AgroA3 {

    public static void main(String[] args) {
        Agricultor agricultor = new Agricultor("Pedro", "SP");
        agricultor.identificaAgricultor();
        agricultor.explicaAgricultor();
        ConsultaTerreno terreno = new ConsultaTerreno(10);
        //terreno.avaliaPrecip();
        //terreno.avaliaTempert();
        //terreno.avaliaFotoperiodo();
        //terreno.avaliaTopografia();
        ConsultaIrrigacao consultaIrrigacao = new ConsultaIrrigacao(terreno);
        consultaIrrigacao.exibeAlgo();
        terreno.avaliaTerreno();
        ControledePraga controledepraga = new ControledePraga();
        controledepraga.exibe();
        Safra producao = new Safra();
        producao.mediaProdução();
    }
}
