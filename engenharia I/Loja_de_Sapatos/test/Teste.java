/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
import loja_de_sapatos.Especificacao;
import loja_de_sapatos.Loja;
import loja_de_sapatos.Sapatos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CASA
 */
public class Teste {
    @Test
    public void test(){
        Loja sapato = new Loja();
        assertEquals(sapato.getSapatos().size(),0);
        
        sapato.cadastrarSapato(new Sapatos("02", new Especificacao("tenis", "vans", "preto", 299.0f)));
        sapato.cadastrarSapato(new Sapatos("03", new Especificacao("tenis", "adidas", "preto", 350.0f)));

        assertEquals(sapato.getSapatos().size(),2);
        
        Sapatos sapatoEncontrado = sapato.buscarSapatoPorCodigo("02");

        assertEquals(sapatoEncontrado.getEspec().getMarca(), "vans");
        
        List<Sapatos> sapatosEncontrados = sapato.buscarSapatoPorEspecificacao(new Especificacao("tenis", "vans", "preto", 299.0f));
    
        assertEquals(sapatosEncontrados.get(0).getEspec().getMarca(), "vans");
    
    }
    
    
    
    public Teste() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
