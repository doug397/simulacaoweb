package br.com.simulacaoweb.teste.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexcaoPost {
	
	public static  void conecatar(UsuarioBean usuarioB){
		/*
		
		String url="jdbc:postegresql://localhost/cadastro";
		String usuario="postgres";
		String senha="";
		
		
		String sql="insert into cliente values(?,?)";
		
		try(Connection conexao= DriverManager.getConnection(url,usuario,senha)){
			System.out.println("Conexao Bem Sucedida");
			
			PreparedStatement insert= conexao.prepareStatement(sql);
			try{	
				insert.setInt(1,pablo.getCodigo());
				insert.setString(2,pablo.getNome());
				
				insert.executeUpdate();
				System.out.println("Inserido COm sucesso");
				
				}catch(SQLException e){
						System.out.println("Erro ao incluir"+e.getMessage());
			
				}finally{
					
					try{
						insert.close();
						conexao.close();
						System.out.println("Fechado Com Sucesso");
					
					}catch(Throwable e){
						System.out.println("Erro ao fechar");
					}
				}
			
		}catch(SQLException e){
			System.out.println("Erro ao se conectar");
		}
		
	}*/
		
		
		
	}
	
}
