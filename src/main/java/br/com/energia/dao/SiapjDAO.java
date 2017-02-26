
package br.com.energia.dao;

import br.com.energia.conexao.Conexao;
import br.com.energia.dominio.Processo;

import java.sql.SQLException;


import java.sql.PreparedStatement;

/**
 *
 * @author Rafael Monteiro
 */
public class SiapjDAO {
    
	  public void adiciona(Processo processo) throws SQLException{
	        
	        Conexao conn = new Conexao();
	        
	        String sql = "insert into processo(nomeReclamante, telefone, email, conteudo) values (?,?,?,?)";
	        
	        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
	        
	        ps.setString(1, processo.getNomeReclamante());
	        ps.setString(2, processo.getTelefone());
	        ps.setString(3, processo.getEmail());
	        ps.setString(4, processo.getConteudo());
	        
	        ps.execute();
	        
	        
	        
	        
	    
	    }
    
}
