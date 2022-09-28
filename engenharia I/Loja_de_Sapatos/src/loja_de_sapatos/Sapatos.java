
package loja_de_sapatos;

public class Sapatos {
    private String codigo;
    private Especificacao espec;

    public Sapatos(String codigo, Especificacao espec) {
        this.codigo = codigo;
        this.espec = espec;}
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Especificacao getEspec() {
        return espec;
    }

    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
    
}

