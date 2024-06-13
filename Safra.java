package com.mycompany.agroa3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Safra {
    private int resposta;
    public Safra(){
        this.resposta=resposta;
    }
    
        public void mediaProdução(){
        List<Integer> numeros = new ArrayList<>();
        do {
            // Limpar a lista de números para cada nova iteração
            numeros.clear();

            // Coletar até 6 números inteiros
            for (int i = 0; i < 6; i++) {
                String input = JOptionPane.showInputDialog(null, "Digite a quantidade produzida das 6 safras em Quilogramas. (ou 'fim' para terminar a inserção):");

                if (input == null || input.equalsIgnoreCase("fim")) {
                    break;
                }

                try {
                    int numero = Integer.parseInt(input);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
                    i--; // Decrementar para repetir a iteração
                }
            }

            // Calcular a média dos números
            if (!numeros.isEmpty()) {
                double soma = 0;
                for (int numero : numeros) {
                    soma += numero;
                }
                double media = soma / numeros.size();
                JOptionPane.showMessageDialog(null, "A média das safras produzidas é: " + media+"kg.");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
            }

            // Perguntar ao usuário se deseja repetir
            setResposta(JOptionPane.showConfirmDialog(null, "Deseja inserir outro conjunto de números?", "Continuar", JOptionPane.YES_NO_OPTION));
        } while (getResposta() == JOptionPane.YES_OPTION);
    }

    /**
     * @return the resposta
     */
    public int getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(int resposta) {
        this.resposta = resposta;
    }
}
