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

    @Test
    public void prodAdyacente() {
        int[] numeros = {1, -4, 2, 2, 5, -1};
        int esperado = 10;
        int actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado, actual);
    }

    @Test
    //Muñoz

    public void prodAdyacente1() {
        int[] numeros = {1, -4, 2, 2, 5, -1};
        int esperado = 9;
        int actual = casoAdyacente.prodAdyacente(numeros);
        assertNotEquals(esperado, actual);
        //Resultado fue positvo
    }
    @Test
    //Robles
    public void prodAdyacente2() {
        int[] numeros = {1,-4,2,2,5,-1};
        int esperado = -10;
        int actual = casoAdyacente.prodAdyacente(numeros);
        assertNotEquals(esperado,actual);
        // resultado es positivo ya que que
    }

    @Test
    //Robles
    public void prodAdyacente3() {
        int[] numeros = {1,-3,0,3};
        int esperado = 0;
        int actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,actual);
        // resultado es positivo
    }

    @Test
    //Robles
    public void prodAdyacente4() {
        int[] numeros = {-1,-2,-3};
        int esperado = 6;
        int actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,actual);
        // resultado es positivo
    }


}