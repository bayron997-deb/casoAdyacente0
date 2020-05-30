import org.junit.*;
import static org.junit.Assert.*;

public class casoAdyacenteTest {

    private casoAdyacente casoadyacente;

    @Before
    public void setUp() throws Exception {
        casoadyacente = new casoAdyacente();
    }

    @After
    public void tearDown() throws Exception {
        casoadyacente = null;
    }

    @Test//muñoz
    public void prodAdyacente0() {
        double[] numeros = {1, -4, 2, 2, 5, -1};
        double esperado = 10;
        double actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,esperado,0);
        //Resultado fue positvo porque el esperado es correcto
    }

    @Test
    //Robles
    public void prodAdyacente2() {
        double[] numeros = {1,-4,2,2,5,-1};
        double esperado = -10;
        double actual = casoAdyacente.prodAdyacente(numeros);
        assertNotEquals(esperado,actual);
        // resultado es positivo ya que que el esperado no es el correcto
    }

    @Test
    //Robles
    public void prodAdyacente3() {
        double[] numeros = {1,-3,0,3};
        double esperado = 1;
        double actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,esperado,0);
        // resultado es positivo
    }
    @Test
    //Robles
    public void prodAdyacente4() {
        double[] numeros = {1,2,3,4};
        double esperado = 12;
        double actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,esperado,0);
        // resultado es positivo
    }

    @Test
    //Robles
    public void prodAdyacente5() {
        double[] numeros = {-1,-2,-3};
        double esperado = 6;
        double actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,esperado,0);
        // resultado es positivo
    }
    @Test
    //Muñoz
    public void prodAdyacente6() {
        double[] numeros = {0.5,1,-3};
        double esperado = 0.5;
        double actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,esperado,0);
        // resultado es positivo
    }


}