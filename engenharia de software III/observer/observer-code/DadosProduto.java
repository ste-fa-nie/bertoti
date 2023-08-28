import java.util.ArrayList;
import java.util.List;

public class DadosProduto {
    private List<Observer> observers;
    private String nomeProduto ;
    private Boolean statusProduto;
    
    public DadosProduto(){
        this.observers = new ArrayList<>();
        this.nomeProduto = "";
        this.statusProduto = false;
    }

    public void setDados(String nome, Boolean status){
        this.nomeProduto = nome;
        this.statusProduto = status;
        notify(nome, status);
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    

    public void notify(String nome, Boolean status){
        this.observers.stream().forEach(item -> {
           item.update(nome, status) ;
        });
    }
    
}