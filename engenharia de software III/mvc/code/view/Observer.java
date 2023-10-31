package view;
import java.util.List;

import model.Lanche;

public interface Observer {

	public void update(List<Lanche> l);
	
}