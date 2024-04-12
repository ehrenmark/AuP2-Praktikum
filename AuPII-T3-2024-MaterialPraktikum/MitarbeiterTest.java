/** 
 * Verbundstudiengang WI (B.Sc.)
 * Algorithmen und Programmierung II
 * T3 - Praktikum - Aufgabe 1 
 * 
 * TestCase zum Testen des Konstruktors der Klasse Mitarbeiter 
 * und der Methoden der Klasse Mitarbeiter, 
 * die die Beziehung zu einem Buero nicht veraendern.
 * 
 * @author Anja Haake 
 */  

import junit.framework.TestCase;

public class MitarbeiterTest extends TestCase
{     Mitarbeiter m1;

    protected void setUp() throws Exception
    {
        super.setUp();
        // Erzeugen eines Exemplars der Klasse Mitarbeiter
        m1 = new Mitarbeiter("Willi", "-234");

    }



    public void testMitarbeiter() {
        // Assert that m1 is not null
        assertNotNull(m1);

        // Assert that the name is as expected
        assertEquals("Willi", m1.gibName());

        // Assert that the telephone number is as expected
        assertEquals("-234", m1.gibTelefonNr());

        // Assert that the office is null (assuming that the office is not set in the constructor)
        assertNull(m1.gibBuero());
    }

    public void testGibName() {
        // Arrange
        String expectedName = "Willi";

        // Act
        String actualName = m1.gibName();

        // Assert
        assertEquals(expectedName, actualName);
    }

    public void testGibTelefonNr() {
        // Arrange
        String expectedTelefonNr = "-234";

        // Act
        String actualTelefonNr = m1.gibTelefonNr();

        // Assert
        assertEquals(expectedTelefonNr, actualTelefonNr);
    }

    public void testGibBuero() {
        // Arrange
        Buero expectedBuero = new Buero(1, 101);
        m1.bezieheBuero(expectedBuero);

        // Act
        Buero actualBuero = m1.gibBuero();

        // Assert
        assertEquals(expectedBuero, actualBuero);
    }

    protected void tearDown() throws Exception
    {
        super.tearDown();
        // Setzen Sie das Mitarbeiter-Objekt auf null
        m1 = null;
    }

}
