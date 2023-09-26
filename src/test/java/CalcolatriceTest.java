import org.example.Calcolatrice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalcolatriceTest {
    Calcolatrice calcolatrice;

    @Before
    public final void setUp(){
        calcolatrice=new Calcolatrice();
    }

    @Test
    public void testSomma(){
        assertTrue("somma corretta",calcolatrice.somma(11,1)==12);
    }
    @Test
    public void testMoltiplicazione(){
        assertTrue("moltiplicazione corretta",calcolatrice.moltiplicazione(10,2)==20);
    }
}