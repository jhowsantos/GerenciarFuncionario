package main;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	private int tempoDeEmpresa;
	
	public Funcionario (String nome, String cargo, double salario, int tempoDeEmpresa){
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}

	public void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}
	
	
}