package model;

public class Lanche {
	
	private String nome;
	private double preco;
	
	public Lanche(String n, double p){
		nome = n;
		preco = p;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getPreco(){
		return this.preco;
	}

	public boolean matches(Lanche l){
		if(!nome.equals(l.nome)) return false;
		return true;
	}
}