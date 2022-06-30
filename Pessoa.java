package dominio;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private int salario;
	private int identificacao;

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void setIdade(int idade) {

		this.idade = idade;

	}

	public void setCpf(String cpf) {
		this.cpf = cpf;

	}

	public void setSalario(int salario) {
		this.salario = salario;

	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;

	}

	public String getNome() {

		return this.nome;

	}

	public int getIdade() {

		return this.idade;
	}

	public String getCpf() {

		return this.cpf;
	}

	public int getSalario() {

		return this.salario;
	}
	public int getIdentificacao() {
		
		return this.identificacao;
	}
}
