package Autentticacao.Autenticacao;

public class Usuario {
	
	private String nome;
	
	private String password;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String password) {
		super();
		this.nome = nome;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
