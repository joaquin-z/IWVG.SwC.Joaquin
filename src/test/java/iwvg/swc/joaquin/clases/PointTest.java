package iwvg.swc.joaquin.clases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point point;

    @Before
    public void before() {
        point = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }
    
    @Test
    public void testPuntoInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    public void testPunto() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, point.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.point.translateOrigin(new Point(1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", point.toString());
    }

}
