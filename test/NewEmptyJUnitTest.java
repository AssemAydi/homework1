/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Assem
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
   @Test 
   public void testNewCart()
   {
   cart a =new cart();
   assertEquals(0,a.count);
   
   }
   
   @Test
   public void testOneBookAdded()
   {
   
   cart a =new cart();
   a.add("Software Engineering", 127);
   assertEquals(1,a.count);
   assertEquals(127,a.total);
   
   }
    
   @Test
   public void testAddingTwoBooks()
   {
    cart a =new cart();
    a.add("Software Engineering", 127);
    a.add("Discrete", 100);
   assertEquals(2,a.count);
   assertEquals(227,a.total);
   
   }    
           
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
