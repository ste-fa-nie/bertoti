public class Pet {
   
    private String petTamanho;
    private Banho banhoTipo;
    
    public Pet(String petTamanho,Banho banho){
        this.petTamanho = petTamanho;
        this.banhoTipo = banhoTipo;
    }

    public void tomarBanho(){
        banhoTipo.tomarBanho();
    }
    
    public void setBanho(Banho banhoTipo){
        this.banhoTipo = banhoTipo;
    }
}