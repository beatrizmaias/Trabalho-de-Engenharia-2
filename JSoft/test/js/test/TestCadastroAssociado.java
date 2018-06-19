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
}
