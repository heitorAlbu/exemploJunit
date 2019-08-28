
package pacoteTestes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



import br.edu.unibratec.psc.jpa.classeTeste;

public class classeTesteTest {
    
    private classeTeste testeClass;
    
    public classeTesteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
       testeClass = new classeTeste();
    }
  
    @After
    public void tearDown() {
    }

    @Test
    public void testNumeroPar() {
        assertEquals(true,testeClass.numeroPar(8) );
   
    }

    @Test
    public void testAreaQuadrado() {
      assertEquals(100, testeClass.areaQuadrado(10));
    }

   
    @Test
    public void testNumeroDivisivel() {
        assertTrue(testeClass.numeroDivisivel(4, 2));
   
    }

}
