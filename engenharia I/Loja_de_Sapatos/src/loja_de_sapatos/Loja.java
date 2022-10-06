package loja_de_sapatos;

import java.util.LinkedList;
import java.util.List;
import loja_de_sapatos.Especificacao;

public class Loja {
    private List<Sapatos> sapatos = new LinkedList<Sapatos>();
    
    public void cadastrarSapato(Sapatos sapato){
        sapatos.add(sapato);
    }
    
    public List<Sapatos> buscarSapatoPorEspecificacao(Especificacao espec){
        List<Sapatos> sapatosEncontrados = new LinkedList<Sapatos>();
        for(Sapatos sapato:sapatos){
            if(sapato.getEspec().comparar(espec)){
                sapatosEncontrados.add(sapato);
            }
        }return sapatosEncontrados;
    } 
    
    public Sapatos buscarSapatoPorCodigo(String codigo){
        for(Sapatos sapato:sapatos){
            if(sapato.getCodigo().equals(codigo)){
                return sapato;
            }
            
         }
        return null;
    }
    public List<Sapatos> getSapatos(){
        return this.sapatos;
    }
    
    

}
