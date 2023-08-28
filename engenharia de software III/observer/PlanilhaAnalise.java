public class PlanilhaAnalise implements Observer {

    public void update(String nomeProduto, Boolean statusProduto){
        System.out.println("O produto: " + nomeProduto + "está em estoque?: " + statusProduto);
    }
}
