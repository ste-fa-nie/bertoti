package view;

import java.util.List;

import model.Lanche;

import controller.Bebida;

public class View implements Observer{
	
	private Bebida b;
	private List<Lanche> listaLanches;
	
	public void setB(Bebida bebida){
		b = bebida;
	}
	
	public void update(List<Lanche> l){
		listaLanches = l;
        this.b.escolherBebida();
		
	}
	
	public void montarCombo(String nome){
		if(!listaLanches.isEmpty()){
			for(Lanche i: listaLanches){
                if(nome == i.getNome()){
				System.out.println("nome lanche:" + i.getNome()+" preço lanche: "+i.getPreco());
            }
			}
		}
	}
}