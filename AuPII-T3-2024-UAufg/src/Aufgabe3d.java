import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuftragTest {

    @Test
    public void testAuftragConstructor() {
        Auftrag auftrag = new Auftrag(2, "Beratung", 10, 125, "18.01.04");

        assertNotNull(auftrag);
        assertEquals(2, auftrag.gibAuftragsnummer());
        assertEquals("Beratung", auftrag.gibBeschreibung());
        assertEquals(10, auftrag.gibStundenanzahl());
        assertEquals(125, auftrag.gibStundensatz());
        assertEquals("18.01.04", auftrag.gibDatum());
    }

}