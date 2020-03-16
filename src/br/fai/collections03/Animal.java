package br.fai.collections03;

public abstract class Animal {

	public void som() {
		System.out.println("Este e o som padrao do animal: zzz");
		
	}
	
	public void dizerMeuNome() {
		System.out.println("O nome do animal e: " +getNome());
	}
	
	private void dizerMinhaIdade() {
		System.out.println("Minha idade e: xxx");
	}
	
	private String cor="preto";
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	private String nome = "nao definido";
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	private int idade = 5;
	public int getIdade() {
		return idade;
	}

	
	
}
