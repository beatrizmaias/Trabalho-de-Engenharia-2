/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js.test;

import model.Associado;
import DAO.AssociadoDAO;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Laecio
 */
public class TestCadastroAssociado {
    Associado as;
    AssociadoDAO asD;
   
   @Before
   public void setup(){
       
     as = new Associado();
     asD = new AssociadoDAO();
     
   }
    
   @After
   public void teardown(){
       asD = null;
   }
   
   @Test
   public void testCadastroValido(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Severo Eulalio");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(64.3);
       as.setTelefone("89994000000");
       assertTrue(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Severo Eulalio");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(0);
       as.setTelefone("");
       assertFalse(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido2(){
       as.setCpf("");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Severo Eulalio");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(0);
       as.setTelefone("89994000000");
       assertFalse(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido3(){
       as.setCpf("00000000000");
       as.setEmail("");
       as.setEndereco("Rua Severo Eulalio");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(0);
       as.setTelefone("89994000000");
       assertFalse(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido4(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(0);
       as.setTelefone("89994000000");
       assertFalse(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido5(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Beutrano de Tal");
       as.setFaixa("");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(0);
       as.setTelefone("89994000000");
       assertFalse(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido6(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Beutrano de Tal");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("");
       as.setPeso(0);
       as.setTelefone("89994000000");
       assertFalse(asD.adiciona(as));
   }
   
   @Test
   public void testCadastroInvalido7(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Beutrano de Tal");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Darkside Opera Faster");
       as.setPeso(0);
       as.setTelefone("");
       assertFalse(asD.adiciona(as));
   }
   
   
   @Test
   public void testCamposVazios(){
       as.setCpf("");
       as.setEmail("");
       as.setEndereco("");
       as.setFaixa("");
       as.setIdade(0);
       as.setNome("");
       as.setPeso(0);
       as.setTelefone("");
       assertFalse(asD.camposVazios(as));
   }
   
   @Test
   public void testCamposPreenchido(){
       as.setCpf("00000000000");
       as.setEmail("laecio8andrade@gmail.com");
       as.setEndereco("Rua Severo Eulalio");
       as.setFaixa("Branca");
       as.setIdade(19);
       as.setNome("Laecio Andrade Rodrigues");
       as.setPeso(64.3);
       as.setTelefone("89994000000");
       assertTrue(asD.camposVazios(as));
   }
   
   @Test
   public void testCadastroCPFInvalidoPorQtdDigitos(){
       as.setCpf("1234567");
       assertFalse(asD.validaNmDigCPF(as));
   }
   
   @Test
   public void testCadastroCPFInvalidoPorQtdDigitos2(){
       as.setCpf("12345672311");
       assertTrue(asD.validaNmDigCPF(as));
   }
   
   @Test
   public void testCadastroIdadeInvalida(){
       as.setIdade(-1);
        assertFalse(asD.validaIdade(as));
   }
   
   @Test
   public void testCadastroIdadeInvalida2(){
       as.setIdade(130);
        assertFalse(asD.validaIdade(as));
   }
   
}
