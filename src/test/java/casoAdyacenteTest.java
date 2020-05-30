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
        int[] numeros = {1,-4,2,2,5,-1};
        int esperado = 9;
        int actual = casoAdyacente.prodAdyacente(numeros);
        assertEquals(esperado,actual);
    }

    @Test
    public void validador() {
    }
}