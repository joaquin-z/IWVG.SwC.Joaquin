package iwvg.swc.joaquin.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(6, 3);
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

    @Test
    public void testIsPropia() {
        fraction = new Fraction(3, 7);
        assertEquals(true, fraction.isPropia());
        fraction = new Fraction(9, 2);
        assertEquals(false, fraction.isPropia());
        fraction = new Fraction(3, -7);
        assertEquals(true, fraction.isPropia());
    }

    @Test
    public void testIsImpropia() {
        fraction = new Fraction(8, 5);
        assertEquals(true, fraction.isImpropia());
        fraction = new Fraction(3, 5);
        assertEquals(false, fraction.isImpropia());
        fraction = new Fraction(-7, 4);
        assertEquals(true, fraction.isImpropia());
    }

    @Test
    public void testIsDecimal() {
        fraction = new Fraction(2, 10);
        assertEquals(true, fraction.isDecimal());
        fraction = new Fraction(7, 20);
        assertEquals(false, fraction.isDecimal());
        fraction = new Fraction(4, -100);
        assertEquals(true, fraction.isDecimal());
    }

    @Test
    public void testIsIndefinite() {
        assertEquals(false, fraction.isIndefinite());
    }
}
