package iwvg.swc.joaquin.clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;
    
    @Before
    public void before() {
        user = new User(1, "Joaquin", "Zamora");
    }

    @Test
    public void testFullName() {
        assertEquals("Joaquin Zamora", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    public void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Joaquin", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Zamora", user.getFamilyName());
    }
    
    @Test
    public void testInvertedFullName() {
        assertEquals("Zamora, Joaquin", user.invertedFullName());
    }

}
