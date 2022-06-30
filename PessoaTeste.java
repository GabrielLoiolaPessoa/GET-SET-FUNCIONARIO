package testes;

import java.io.ObjectInputStream.GetField;

import dominio.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Nome Funcionário");
		pessoa.setIdade(37);
		pessoa.setCpf("000.100.200-30");
		pessoa.setSalario(3000);
		pessoa.setIdentificacao(111000111);
		
		
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("Idade: "+pessoa.getIdade());
		System.out.println("Cpf: "+pessoa.getCpf());
		System.out.println("Salário: "+pessoa.getSalario());
		System.out.println("Identificação: "+pessoa.getIdentificacao());
		

	}
}
