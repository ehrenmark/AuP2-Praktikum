/** 
 * Verbundstudiengang WI (B.Sc.)
 * Algorithmen und Programmierung II
 * T3 - Praktikum - Aufgabe 1 
 * 
 * TestCase zum Testen des Konstruktors und aller Methoden der Klasse Buero,
 * bei denen kein Mitarbeiter involviert ist.
 * 
 * @author Anja Haake 
 */  

import junit.framework.TestCase;

public class BueroTest extends TestCase
{
    Buero b1;

    protected void setUp() throws Exception
    {
        super.setUp();
        // Erzeugen eines Testexemplars der Klasse Buero
        b1 = new Buero(1,10);
    }

    public void testBuero()
    {
        // Nachbedingungen
        assertNotNull(b1);
        assertEquals(1, b1.gibEtage());
        assertEquals(10, b1.gibRaumNr());
        assertNull(b1.gibBeleger());
    }

    public void testGibEtage()
    {
        // Nachbedingungen
        assertEquals(1, b1.gibEtage());
    }
    
    public void testGibRaumNr()
    {
        // Nachbedingungen
        assertEquals(10, b1.gibRaumNr());
    }
    
    public void testGibBeleger()
    {
        // Nur fuer den Fall, dass der Raum noch nicht belegt ist
        assertNull(b1.gibBeleger());
    }

    protected void tearDown() throws Exception
    {
        super.tearDown();
        // Aufraeumarbeiten
        b1 = null;
    }
}
