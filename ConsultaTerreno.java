package com.mycompany.agroa3;

import javax.swing.JOptionPane;

public class ConsultaTerreno {
    private int precip;
    private int temp;
    private int foto;
    private int topografia;
    private double areaplantio;
    
    public ConsultaTerreno(int areaplantio){
        this.areaplantio=areaplantio;
    }    

    public ConsultaTerreno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void avaliaPrecip(){
        setPrecip(Integer.parseInt(JOptionPane.showInputDialog("Qual a precipitação anual da sua região?(mm)")));
        if(getPrecip()<=2000 && getPrecip()>=1500){
            JOptionPane.showMessageDialog(null, "Esta é precipitação anual ideal!");
        }
        if(getPrecip()>2000){
            JOptionPane.showMessageDialog(null, "Há uma elevada precipitação anual na sua região, sem muita necessidade de irrigação.");
        }else{
            JOptionPane.showMessageDialog(null, "Há pouca precipitação anual na sua região, aumentando a necessidade de irrigação.");
        }
    }
    
    public void avaliaTempert(){
        setTemp(Integer.parseInt(JOptionPane.showInputDialog("Qual a temperatura média anual da região?(°C)")));
        if(getTemp()<=35 && getTemp()>=20){
            JOptionPane.showMessageDialog(null, "Temperatura ideal da região!");
        }else{
            JOptionPane.showMessageDialog(null, "Temperatura inadequada para o plantio de cana!");
        }
    }
    
    public void avaliaFotoperiodo(){
        setFoto(Integer.parseInt(JOptionPane.showInputDialog("Qual o fotoperíodo média anual da região?(h)")));
        if(getFoto()<=13 && getFoto()>=10){
            JOptionPane.showMessageDialog(null, "Fotoperíodo ideal da região!");
        }else{
            JOptionPane.showMessageDialog(null, "Fotoperíodo inadequada para o plantio de cana!");
        }
    }
    
    public void avaliaTopografia(){
        setTopografia(Integer.parseInt(JOptionPane.showInputDialog("Qual a declividade da região?(%)")));
        if(getTopografia()<=12){
            JOptionPane.showMessageDialog(null, "Declividade ideal da região!");
        }else{
            JOptionPane.showMessageDialog(null, "Declividade inadequada para o plantio de cana!");
        }
    }
    
    public void avaliaTerreno(){
        setAreaplantio(Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão da área para o plantio?(ha)")));
        String texto = "A divisão do terreno será fracionado em quatro partes:\n";
        texto = texto + "--------------------------------------------------------\n";
        texto = texto + "| A: 25% do terreno para o plantio de variedade precoce; |\n";
        texto = texto + "| B: 35% do terreno para o plantio de variedade media;   |\n";
        texto = texto + "| C: 25% do terreno para o plantio de variedade tardia;  |\n";
        texto = texto + "| D: 15% do terreno para a preservação.                  |\n";        
        texto = texto + "--------------------------------------------------------\n";
        //JOptionPane.showMessageDialog(null, "A divisão do terreno será fracionado em quatro partes: A: 25% do terreno para o plantio de variedade precoce; B: 35% do terreno para o plantio de variedade media; C: 25% do terreno para o plantio de variedade tardia; D: 15% do terreno para a preservação.");
        JOptionPane.showMessageDialog(null, texto);
        double A = getAreaplantio()*0.25;
        double B = getAreaplantio()*0.35;
        double C = getAreaplantio()*0.25;
        double D = getAreaplantio()*0.15;
        JOptionPane.showMessageDialog(null, "A divisão do terreno: A: "+A+" ha; B: "+B+" ha; C: "+C+" ha; D: "+D+" ha.");
    }

    /**
     * @return the precip
     */
    public int getPrecip() {
        return precip;
    }

    /**
     * @param precip the precip to set
     */
    public void setPrecip(int precip) {
        this.precip = precip;
    }

    /**
     * @return the temp
     */
    public int getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(int temp) {
        this.temp = temp;
    }

    /**
     * @return the foto
     */
    public int getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(int foto) {
        this.foto = foto;
    }

    /**
     * @return the topografia
     */
    public int getTopografia() {
        return topografia;
    }

    /**
     * @param topografia the topografia to set
     */
    public void setTopografia(int topografia) {
        this.topografia = topografia;
    }

    /**
     * @return the areaplantio
     */
    public double getAreaplantio() {
        return areaplantio;
    }

    /**
     * @param areaplantio the areaplantio to set
     */
    public void setAreaplantio(double areaplantio) {
        this.areaplantio = areaplantio;
    }
}

