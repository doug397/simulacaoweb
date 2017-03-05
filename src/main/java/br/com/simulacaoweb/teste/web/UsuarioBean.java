package br.com.simulacaoweb.teste.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {
	
	private String nome;
	private String email;
	private String senha;
	private String confirmaSenha;
	
	
	
	
	public String novo(){
			
		return "usuario";
		
	}
	
	public String salvar(){
		
		
			
		
		FacesContext context= FacesContext.getCurrentInstance();
		if(!this.senha.equalsIgnoreCase(this.confirmaSenha)){
			
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Senha Confrimada Incorretamente Verifique suas Credenciais",""));
				
			ListaUsuarios lista= new ListaUsuarios();
			System.out.println(lista.toString());
			
		
			
			
			return "usuario";
		}
		
		return "mostrausuario";
		
	}
	
	
	public String operacao(){
		return "resultado";
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	
	public  void conecta (){
			
     String url="jdbc:postgresql://localhost/cadastro";
		
		String usuario="postgres";
		String senha="";
		String sql="insert into usuario values(?,?)";
		
		try(Connection conexao= DriverManager.getConnection(url,usuario,senha)){
			System.out.println("Conexao Bem Sucedida");
			
			PreparedStatement insert= conexao.prepareStatement(sql);
			try{	
				insert.setString(1,this.getNome());
				insert.setString(2,this.getSenha());
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
		
	}
		
	
}
