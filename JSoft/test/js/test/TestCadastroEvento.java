/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js.test;

/**
 *
 * @author Laecio
 */
import model.Evento;
import DAO.EventoDAO;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class TestCadastroEvento {
    Evento ev;
    EventoDAO evD;
   
   @Before
   public void setup(){
       
     ev = new Evento();
     evD = new EventoDAO();  
   }
    
   @After
   public void teardown(){
       evD = null;
   }
   
   @Test
   public void testCadastroEventoValido(){
       ev.setData("11042018");
       ev.setFaixa("Branca");
       ev.setNome("Judo Infantil");
       assertTrue(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido(){
       ev.setData("");
       ev.setFaixa("Branca");
       ev.setNome("Judo Infantil");
       assertFalse(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido2(){
       ev.setData("11092018");
       ev.setFaixa("");
       ev.setNome("Judo Infantil");
       assertFalse(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido3(){
       ev.setData("11092018");
       ev.setFaixa("Branca");
       ev.setNome("");
       assertFalse(evD.camposVazios(ev));
   }
   
   @Test
   public void testDataInvalidaComLetras(){
       ev.setData("11jun2018");
       assertFalse(evD.verificaNumsDadata(ev));
   }
   
   @Test
   public void testDataValidasemLetras(){
       ev.setData("11042019");
       assertTrue(evD.verificaNumsDadata(ev));
   }
}
