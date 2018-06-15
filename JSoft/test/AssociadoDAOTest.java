
import DAO.*;
import model.Associado;
import org.junit.After;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author firmi
 */


public class AssociadoDAOTest {
    
    AssociadoDAO a;
    
    @Before
    public void setup (){
        a = new AssociadoDAO();
    }
    
    @After
    public void teardown(){
        a = null;
    }
    
    
    @Test
    public void adicionarTest(){
        Associado a = new Associado("Fulano" 
                    , "608.976.144-58"
                    , 25
                    , "fulano@beltrano.com"
                    , "Rua dos mortos vivos"
                    , "88888-888888"
                    , 56
                    , "Preta");
        AssociadoDAO associado = new AssociadoDAO();
            assertTrue( associado.adicionarTest(a));
           
    }
    
    public void associadoIdadeTest(){
        //Associado a = new Associado();
    }
    
}
