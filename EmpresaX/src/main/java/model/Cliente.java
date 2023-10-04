package model;

public class Cliente {
	private int idCliente;
	private String Nome;
	private String Telefone;
	private String Cpf;
	private String Rg;
	
	public Cliente(int idCliente, String nome, String telefone, String cpf, String rg) {
		super();
		this.idCliente = idCliente;
		Nome = nome;
		Telefone = telefone;
		Cpf = cpf;
		Rg = rg;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}
	
	
	
	

}
