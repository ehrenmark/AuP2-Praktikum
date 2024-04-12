/** 
 * Verbundstudiengang WI (B.Sc.)  
 * Algorithmen und Programmierung II
 * T3 - Praktikum - Aufgabe 1 
 * 
 * Klasse zur Modellierung von Bueroraeumen. 
 * Ein Bueroraum kann einem Mitarbeiter zugeordnet werden.
 * 
 * @author Anja Haake
 */  

public class Buero
{   int etage; 
    int raumNr;
    Mitarbeiter beleger;

    public Buero(int etage, int raumNr)
    {   this.etage = etage;
        this.raumNr = raumNr;

    }
    
    public int gibEtage()
    {
        return etage;
    }

    public int gibRaumNr()
    {
        return raumNr;
    }

    public Mitarbeiter gibBeleger()
    {
        return beleger;
    }
    

    // Zur Methode belegeMit:
    // Hier geht es um die Verwaltung der Beziehung eines Bueros 
    // zu einem eventuellen Mitarbeiter.
    // Die Methode wird von der Methode bezieheBuero der 
    // Klasse Mitarbeiter aufgerufen.
    // Die Methode bezieheBuero ist in der Klasse Mitrbeiter 
    // korrekt implementiert.
    //  
    // Ueberlegen Sie: 
    // - Wann ist eine Belegung eines Bueros mit einem Mitarbeiter 
    //   moeglich?
    // - Was ist zu tun, falls der Mitarbeiter bereits 
    //   ein (anderes) Buero bezogen hat?
    public void belegeMit(Mitarbeiter mitarbeiter)
    {
       // Hier fehlt noch was, siehe Kommentar oben 
    }

    public void zieheBueroFrei()
    {
        // HIER FEHLT NOCH WAS
    }

}
