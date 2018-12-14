package main;

public class Funcionario {
	private String nome;
	private String cargo;
	private int salario;
	private int tempoDeEmpresa;
	
	public Funcionario (String nome, String cargo, int salario, int tempoDeEmpresa){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.tempoDeEmpresa = tempoDeEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}

	public void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}
	
	
}