package model;
import java.util.List;
import java.util.LinkedList;

import view.Observer;

public class Cardapio implements Subject{
	
	private List lanches;
	private List observers;
	
	public Cardapio(){
		lanches = new LinkedList();
		observers = new LinkedList();
	}
	
	
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	
	public void notifyObservers(List encontrados){
		for(Object i: observers){
			Observer ob = (Observer)i;
			ob.update(encontrados);
		}
	}
	
	public void addLanche(Lanche l){
		lanches.add(l);
	}
	
	public void buscarLanche(Lanche l){
		List encontrados = new LinkedList();
		for(Object i: lanches){
			Lanche lancheCardapio = (Lanche)i;
			if(lancheCardapio.matches(l)) encontrados.add(lancheCardapio);
		}
		notifyObservers(encontrados);
	}

}