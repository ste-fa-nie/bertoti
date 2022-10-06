package loja_de_sapatos;

public class Especificacao {
    private String tipo;
    private String marca;
    private String corSapato;
    private float preco;

    public Especificacao(String tipo, String marca, String corSapato, float preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.corSapato = corSapato;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCorSapato() {
        return corSapato;
    }

    public void setCorSapato(String corSapato) {
        this.corSapato = corSapato;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public boolean comparar(Especificacao especificacao){
        if(marca.equals(especificacao.marca) && tipo.equals(especificacao.tipo) && corSapato.equals(especificacao.corSapato)){
            return true;}
        else{
            return false;
        }
                              
    }
    public void Bespec(){
        System.out.println(this.corSapato);
        System.out.println(this.marca);
        System.out.println(this.preco);
        System.out.println(this.tipo);
    }
}

