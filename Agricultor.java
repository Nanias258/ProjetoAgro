package com.mycompany.agroa3;
import javax.swing.*;
public class Agricultor {
    private String nome;
    private String regiao;
    public Agricultor(String nome, String regiao){
        this.nome=nome;
        this.regiao=regiao;
    }

 
    public void identificaAgricultor(){
        
        JOptionPane.showMessageDialog(null, "Olá Agricultor!");
        setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
        setRegiao(JOptionPane.showInputDialog("Qual a sua região?(UF)"));
    }
    public void explicaAgricultor(){
        JOptionPane.showMessageDialog(null, "Olá "+getNome()+", este é um programa desenvolvido para auxiliar no planejamento e sistematização do plantio de cana.");
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the regiao
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * @param regiao the regiao to set
     */
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

}
