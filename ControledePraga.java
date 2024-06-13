package com.mycompany.agroa3;

import javax.swing.*;

public class ControledePraga {
     private Praga[] pragas;
     
     public ControledePraga() {
         Praga[] pragas = {
            new Praga("Broca da Cana", "Aplicar inseticidas específicos, como fipronil ou clorpirifos."),
            new Praga("Pulgão da Cana", "Usar óleo mineral ou inseticidas sistêmicos, como imidacloprido."),
            new Praga("Cigarrinha", "Aplicar inseticidas biológicos como Beauveria bassiana ou químicos como tiametoxam."),
            new Praga("Sphenophorus levis", "Realizar rotação de culturas e usar nematoides entomopatogênicos."),
            new Praga("Cupim", "Usar iscas com reguladores de crescimento de insetos ou cupinicidas químicos.")
        };
        this.pragas = pragas;
     }
   
     public void exibe() {
         
        // Opções de pragas para exibição 
        String[] opcoesPragas = new String[getPragas().length];
        for (int  i = 0; i < getPragas().length; i++){
            opcoesPragas[i] = getPragas()[i].getNome();
        }   
        
        // Solicitar ao usuário selecionar uma praga
        String pragaEscolhida = (String) JOptionPane.showInputDialog(
            null,
            "Selecione uma praga:",
            "Controle de Pragas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoesPragas,
            opcoesPragas[0]
        );

        // Encontrar a praga selecionada e exibir a solução
        if (pragaEscolhida != null){
            for (Praga praga : getPragas()) {
                if (praga.getNome().equals(pragaEscolhida)) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Solução para " + praga.getNome() + ":\n" + praga.getSolucao(),
                        "Solução de Controle de Pragas",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma praga selecionada.", "Controle de Pragas", JOptionPane.WARNING_MESSAGE);
        }
         
         
     }

    /**
     * @return the pragas
     */
    public Praga[] getPragas() {
        return pragas;
    }

    /**
     * @param pragas the pragas to set
     */
    public void setPragas(Praga[] pragas) {
        this.pragas = pragas;
    }
}
    


