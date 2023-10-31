package controller;

import model.Cardapio;
import view.View;

public class Refrigerante implements Bebida{

	private View v;
	private Cardapio c;
	
	public void setV(View view){
		v = view;
	}
	
	public void escolherBebida(String nome){
		v.montarCombo(nome);
	}
	
}