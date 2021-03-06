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
       ev.setValor(100);
       assertTrue(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido(){
       ev.setData("");
       ev.setFaixa("Branca");
       ev.setNome("Judo Infantil");
       ev.setValor(100);
       assertFalse(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido2(){
       ev.setData("11092018");
       ev.setFaixa("");
       ev.setNome("Judo Infantil");
       ev.setValor(100);
       assertFalse(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido3(){
       ev.setData("11092018");
       ev.setFaixa("Branca");
       ev.setNome("");
       ev.setValor(100);
       assertFalse(evD.camposVazios(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido4(){
       ev.setData("110920181");
       ev.setFaixa("Branca");
       ev.setNome("Judoca");
       ev.setValor(100);
       assertFalse(evD.adiciona(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido5(){
       ev.setData("1109208");
       ev.setFaixa("Branca");
       ev.setNome("Judoca");
       ev.setValor(100);
       assertFalse(evD.adiciona(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido6(){
       ev.setData("11Junho2018");
       ev.setFaixa("Branca");
       ev.setNome("Judoca");
       ev.setValor(100);
       assertFalse(evD.adiciona(ev));
   }
   
   @Test
   public void testCadastroEventoInvalido7(){
       ev.setData("OnzeJunho2018");
       ev.setFaixa("Branca");
       ev.setNome("Judoca");
       ev.setValor(100);
       assertFalse(evD.adiciona(ev));
   }
   
   public void testCadastroEventoInvalido8(){
       ev.setData("11082018");
       ev.setFaixa("Branca");
       ev.setNome("Judoca");
       ev.setValor(-1);
       assertFalse(evD.adiciona(ev));
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
   
   @Test
   public void testDataInvalidaQtdNums(){
       ev.setData("110420181");
       assertFalse(evD.verificaQtdNumsData(ev));
   }
   
   @Test
   public void testDataInvalidaQtdNums2(){
       ev.setData("1104201");
       assertFalse(evD.verificaQtdNumsData(ev));
   }
   
   @Test
   public void testDataValidaQtdNums(){
       ev.setData("11042018");
       assertTrue(evD.verificaQtdNumsData(ev));
   }
   
   @Test
   public void tsetValorInvalido(){
       ev.setValor(-1);
       assertFalse(evD.valorEvento(ev));
   }
   
   @Test
   public void tsetValorValido(){
       ev.setValor(100);
       assertTrue(evD.valorEvento(ev));
   }
}
