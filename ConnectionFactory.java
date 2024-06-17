package com.mycompany.connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

        private String usuario = "root";
        private String senha = "anima123";
        private String URL = "jdbc:mysql://localhost:3306/A3?useTimezone=true&severTimezone=UTC";
       // private String host = "localhost";
        //private String porta = "3306";
        //private String db = "Universidade";
        //private String timezone = "America/São Paulo";
        
        public Connection obtemconexao(){
            
            try{
                //String url = "jdbc:mysql://"+getHost()+":"+getPorta()+"/"+getDb()+"?serverTimezone="+getTimezone();
                Connection conectar = DriverManager.getConnection(getURL(),usuario,senha);
                /*Connection conectar = DriverManager.getConnection(
                        "jdbc:mysql://"+getHost()+":"+getPorta()+"/"+getDb(), getUsuario(), getSenha()
                );*/
                if(conectar!=null){
                    System.out.println("Conexão estabelecidada com sucesso!");
                }
                return conectar;
            } catch(SQLException e){
                System.out.println("Erro ao tentar estabelecer conexão com o banco de dados");
                e.printStackTrace();
                return null;
            }
        }
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.obtemconexao();
        
        if(connection != null){
            System.out.println("Conexão testada e aprovada!");
        }else{
            System.out.println("Falha na conexao!");
        }

    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the URL
     */
    public String getURL() {
        return URL;
    }

    /**
     * @param URL the URL to set
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    

}
