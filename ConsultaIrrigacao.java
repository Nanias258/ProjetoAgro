package com.mycompany.agroa3;
import javax.swing.*;

public class ConsultaIrrigacao {
    private Object[] itens;
    private ConsultaTerreno consultaTerreno;
    
    public ConsultaIrrigacao (ConsultaTerreno consultaTerreno){
        this.consultaTerreno = consultaTerreno;
        Object[] itens = { "Irrigação de salvação", "Irrigação de produção " };
        this.itens = itens;
    }

    public void exibeAlgo() {
        Object selectedValue = JOptionPane.showInputDialog(null,
              "Escolha um método", "Opçao",
                  JOptionPane.INFORMATION_MESSAGE, null, getItens(), getItens() [0]); 

     if(getItens().equals("Irrigação de salvação")) {
         String  texto1  = "A aplicação é feita em duas irrigações de 60 milímetros por cada 100 hectares por mês \n" ;
         JOptionPane.showMessageDialog (null, texto1);
         double is = getConsultaTerreno().getAreaplantio()*1.2;

     }else if(getItens().equals("Irrigação de produção")){
    String  texto2  = "A aplicação é feita em quatro irrigações de  60 milímetros por cada 100 hectares por mês\n";
                JOptionPane.showMessageDialog(null, texto2);
                  double ip = getConsultaTerreno().getAreaplantio()*2.4;

         }
        
    }

    /**
     * @return the itens
     */
    public Object[] getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(Object[] itens) {
        this.itens = itens;
    }

    /**
     * @return the consultaTerreno
     */
    public ConsultaTerreno getConsultaTerreno() {
        return consultaTerreno;
    }

    /**
     * @param consultaTerreno the consultaTerreno to set
     */
    public void setConsultaTerreno(ConsultaTerreno consultaTerreno) {
        this.consultaTerreno = consultaTerreno;
    }
}

