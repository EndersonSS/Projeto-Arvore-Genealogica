package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    
  public Connection Connection;
  
    public Connection getConnection() {
		return Connection;
	}
	public void setConnection(Connection connection) {
		this.Connection = connection;
	}
    public Connection estabelecerConexao(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/arvore","root","root");
		return con;	
        } catch (SQLException ex) {
            System.out.println("ERRO, NÃO ABRIR CONEXÃO!");
            throw new RuntimeException(ex);
        }
                    }
	public void encerrarConexao(){
		try {
			estabelecerConexao().close();
		} catch (SQLException e) {
		}
	}	    
    
}
