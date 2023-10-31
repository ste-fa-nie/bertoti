package controller;

import model.Cardapio;
import view.View;

public class Suco implements Bebida{

	private View v;
	private Cardapio c;
	
	public void setV(View view){
		v = view;
	}
	
	public void escolherBebida(String nome){
		v.montarCombo(nome);
	}
	
}