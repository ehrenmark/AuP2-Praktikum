/** 
 * Verbundstudiengang WI (B.Sc.)  
 * Algorithmen und Programmierung II
 * T3 - Praktikum - Aufgabe 1 
 * 
 * TestCase zum Testen 
 * der Methoden der Klasse Mitarbeiter, 
 * die die Beziehung zu einem Buero veaendern koennen 
 * und
 * Methoden der Klasse Buero, 
 * die die Beziehung zu einem Mitarbeiter veraendern koennen
 * 
 * @author Anja Haake 
 */   

import junit.framework.TestCase;

public class AssoziationenTest extends TestCase
{
    Mitarbeiter m1, m2;

    Buero b1, b2;

    protected void setUp() throws Exception
    {
        super.setUp();
        // Erzeugen von Testexemplaren beider Klassen
        m1 = new Mitarbeiter("Haensel", "-0815");
        m2 = new Mitarbeiter("Gretel", "-4711");
        b1 = new Buero(1, 10);
        b2 = new Buero(2, 15);
    }

    public void testBezieheBuero()
    {
        // Vorbedingungen
        assertNotNull(m1);
        assertNull(b1.gibBeleger());

        // Aufruf der zu testenden Methode
        m1.bezieheBuero(b1);

        // Nachbedingungen == Vorbedingung den Versuch ein belegtes Buero zu
        // beziehen
        assertEquals(b1, m1.gibBuero());
        assertEquals(m1, b1.gibBeleger());

        // Ergaenzung der Vorbedingung fuer den Versuch, ein belegtes Buero zu
        // beziehen
        assertNotNull(m2);
        assertNull(m2.gibBuero());

        // Aufruf der zu testenden Methode
        m2.bezieheBuero(b1);

        // Nachbedingungen - der Einzug vom m2 in das durch m1 belegete Buero darf nicht gelingen
        assertNull(m2.gibBuero());
        assertEquals(m1, b1.gibBeleger());
    }

    public void testBelegeMit()
    {   // Vorbedingung
        assertNull(m1.gibBuero());
        assertNull(b1.gibBeleger());

        // Aufruf der zu testenden Methode
    
        b1.belegeMit(m1);

        // Nachbedingung == Teil der Vorbedingung für den 
        // unten folgenden Test ein belegtes Buero noch einmal zu belegen
        assertEquals(m1, b1.gibBeleger());
        assertEquals(b1, m1.gibBuero());

        // weitere Vorbedingungen
        assertNull(m2.gibBuero());

        // Aufruf der zu testenden Methode
        b1.belegeMit(m2);

        // Nachbedingung
        assertNull(m2.gibBuero());
        assertEquals(m1, b1.gibBeleger());
        assertEquals(b1, m1.gibBuero());
        
        // Mitarbeiter, der schon ein Buero hat,
        // in ein anderes leeres Buero einziehen lassen; 
        // darf nicht funktionieren
        assertNull(b2.gibBeleger());
        
        b2.belegeMit(m1);
        
        assertNull(b2.gibBeleger());
        assertEquals(m1, b1.gibBeleger());
        assertEquals(b1, m1.gibBuero());         
    }
    
    public void testAusBueroZiehen()
    {   
        fail("Hier ist noch was zu tun");
        // Vorbedingung und Exemplare in einen geeigneten Zustand versetzen:
        // Es muss zuaechst ein Mitarbeiter in ein Buero eingezogen sein,
        // bevor man den erfolgreichen Auszug aus einem Buero testen kann
        

        // Aufruf der zu testenden Methode
        

        // Nachbedingung - was muss nach dem Auszug für das Buero gelten und was für den Mitarbeiter
        
        // Test des Ausziehens aus einem Büro fuer einen Mitarbeiter, der noch gar kein Buero hat
        
        
        // Nachbedingung
        
        
    }
    
    public void testZieheBueroFrei()
    // HIER DEN TEST FORMULIEREN
    { 
        fail("Hier ist noch was zu tun");
        
    }
    
    public void testTauscheBueroMit()
    // HIER DEN TEST FORMULIEREN
    { 
        fail("Hier ist noch was zu tun");
        // Exemplare in geeigneten Zustand versetzen
        // m1 soll b1 beziehen und m2 soll in b2 einziehen
        

        // Aufruf der zu testenden Methode
        m1.tauscheBueroMit(m2);

        // Nachbedingung - was muss nach dem Buerotausch für die beteiligten Mitarbeiter und Bueros gelten
        assertEquals(m2, b1.gibBeleger());
        // HIER FEHLT NOCH WAS
    }
    
    protected void tearDown() throws Exception
    {
        super.tearDown();
        // Allgemeine Konsistenzbedingungen, die nach jedem Testdurchlauf gelten
        // muessen
        if (m1 != null)
            if (m1.gibBuero() != null)
                assertEquals(m1, m1.gibBuero().gibBeleger());
        if (b1 != null)
            if (b1.gibBeleger() != null)
                assertEquals(b1, b1.gibBeleger().gibBuero());

        // Aufraeumarbeiten
        m1 = m2 = null;
        b1 = b2 = null;
    }
}
