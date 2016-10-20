import myutils.FactorialException;
import myutils.EdatNoValidaException;
import myutils.CadenaNoValidaException;
import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class JUnit_test {
    
    public JUnit_test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public final void testInverteixCadena() throws CadenaNoValidaException {

        assertEquals("odnuM aloH", MyUtils.inverteix("Hola Mundo"));
    }

    @Test
    public final void testInverteixCadena1() throws CadenaNoValidaException {

        assertEquals("null", MyUtils.inverteix(""));
    }
    
    @Test
    public final void testInverteixCadena2() throws CadenaNoValidaException {

        assertEquals("saneuB", MyUtils.inverteix("Buenas"));
    }
    
    @Test
    public final void testEdatValida() throws EdatNoValidaException {

        assertEquals(20, MyUtils.edat(27, 2, 1996));
    }
    
    @Test
    public final void testEdatValida1() throws EdatNoValidaException {

        assertEquals(-1, MyUtils.edat(27, 2, 1000));
    }
    
    @Test
    public final void testEdatValida2() throws EdatNoValidaException {

        assertEquals(-2, MyUtils.edat(27, 2, 3000));
    }
    
    @Test
    public final void testEsFactorial() throws FactorialException {

        assertEquals(1, MyUtils.factorial(0), 0);
    }
    
    @Test
    public final void testEsFactorial1() throws FactorialException {

        assertEquals(1, MyUtils.factorial(1), 0);
    }
    
    @Test
    public final void testEsFactorial2() throws FactorialException {

        assertEquals(6, MyUtils.factorial(3), 0);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
