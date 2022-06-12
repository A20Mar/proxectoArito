/**
 * Probas para a clase Circulo
 * @author profesor
 */
package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author profesor
 */
public class AritoTest {
    
    public AritoTest() {
    }
    
    /**
     * Test of setCoordenadaX method, of class Arito.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Arito instance = new Arito();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test of getCoordenadaX method, of class Arito.
     */
    @Test
    public void testObterX() {
        System.out.println("obterX");
        Arito instance = new Arito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoordenadaY method, of class Arito.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Arito instance = new Arito();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test of getCoordenadaY method, of class Arito.
     */
    @Test
    public void testObterY() {
        System.out.println("obterY");
        Arito instance = new Arito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRadio method, of class Arito.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Arito instance = new Arito();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test of getRadio method, of class Arito.
     */
    @Test
    public void testObterRadio() {
        System.out.println("obterRadio");
        Arito instance = new Arito(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obterDiametro method, of class Arito.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Arito instance = new Arito(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obterCircunferencia method, of class Arito.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Arito instance = new Arito(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obterSuperficie method, of class Arito.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Arito instance = new Arito(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of trasladarCentro method, of class Arito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Arito instance = new Arito();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
