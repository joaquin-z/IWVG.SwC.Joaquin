package iwvg.swc.joaquin.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

private Fraction fraction;
    
    @Before
    public void before() {
        fraction = new Fraction (6,3);     
    }
    
    @Test
    public void testFractionIntInt() {
        assertEquals(6, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }
    
    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
    
    @Test
    public void testDecimal() {
        assertEquals(2.0, fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testGetNumerator() {
        assertEquals(6, fraction.getNumerator());
    }
    
    @Test
    public void testGetDenominador() {
        assertEquals(3, fraction.getDenominator());
}

}
