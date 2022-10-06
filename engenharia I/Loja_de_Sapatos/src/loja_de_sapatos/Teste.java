/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loja_de_sapatos;
/**
 *
 * @author Aluno
 */
public class Teste {

    
    public static void main(String[] args) {
        Loja sapato1 = new Loja();
        Loja sapato2= new Loja();
        
        sapato1.cadastrarSapato(new Sapatos("02", new Especificacao("tenis", "vans", "preto", 299.0f)));
        sapato2.cadastrarSapato(new Sapatos("03", new Especificacao("tenis", "adidas", "preto", 350.0f)));
        
        Sapatos busca = sapato1.buscarSapatoPorCodigo("02");

        busca.getEspec().Bespec();
       
    }
    
}
