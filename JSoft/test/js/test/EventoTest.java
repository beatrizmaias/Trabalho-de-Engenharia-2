/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js.test;

import DAO.EventoDAO;
import model.Evento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author firmi
 */
public class EventoTest {
    

    Evento ev;
    EventoDAO evD;
   
   @Before
   public void setup(){
       
     ev = new Evento();
     evD = new EventoDAO();
     
   }
    
   @After
   public void teardown(){
       ev = null;
       evD = null;
   }
   
   public void nomeInavlidoTest(){
       ev.setNome("DF");
       
       assertFalse(evD.adiciona(ev));
   }
   
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
