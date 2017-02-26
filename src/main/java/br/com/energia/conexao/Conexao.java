package br.com.energia.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

public class Conexao {
    
    private Connection conn;
    
    private void conectar(){
        System.out.println("Conectando ao banco...");
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/siapj", "root", "");
            System.out.println("Conectado..");
        } catch (SQLException e) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
       
        }
        
        
    }
    
    public Connection getConexao(){
      conectar();
      
      return conn;
    
    }
    
}
