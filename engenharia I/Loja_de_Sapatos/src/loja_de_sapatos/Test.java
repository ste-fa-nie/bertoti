
package loja_de_sapatos;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Loja sapato1 = new Loja();
        Loja sapato2= new Loja();
        
        sapato1.cadastrarSapato(new Sapatos("02", new Especificacao("tenis", "vans", "preto", 299.0f)));
        sapato2.cadastrarSapato(new Sapatos("03", new Especificacao("tenis", "adidas", "preto", 350.0f)));

        //assertEquals(sapato.getSapatos().size(),2);
        
        Sapatos sapatoEncontrado = sapato1.buscarSapatoPorCodigo("02");
        System.out.println(sapatoEncontrado);

        //assertEquals(sapatoEncontrado.getEspec().getMarca(), "vans");
        
        List<Sapatos> sapatosEncontrados = sapato1.buscarSapatoPorEspecificacao(new Especificacao("tenis", "vans", "preto", 299.0f));
        System.out.println(sapatosEncontrados);
        //assertEquals(sapatosEncontrados.get(0).getEspec().getMarca(), "vans");


    }
    
}
