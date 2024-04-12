/** 
 * Verbundstudiengang WI (B.Sc.) 
 * Algorithmen und Programmierung II 
 * T3 - Praktikum - Aufgabe 1 
 * 
 * Klasse zur Modellierung von Mitarbeitern, die einem Buero zugeordnet werden koennen.
 * 
 * @author Anja Haake 
 */   

public class Mitarbeiter
{
    String name;

    Buero buero;
    
    String telefonNr;


    public Mitarbeiter(String name, String telefonNr) {
        this.name = name;
        this.telefonNr = telefonNr;
    }

    public String gibName()
    {
        return this.name;
    }
    
    public String gibTelefonNr()
    {
        return this.telefonNr;
    }
    
    public Buero gibBuero()
    {
        return this.buero; 
    }

    public void bezieheBuero(Buero buero)
    {
        if (buero != null && buero.gibBeleger() == null)
        // Es wurde ein Buero uebergeben und 
        // dieses Buero ist noch nicht belegt
        {
            this.buero = buero; // this hier absolut notwendig, warum?
            buero.belegeMit(this);
        }
    }

    public void ausBueroZiehen()
    {
        // HIER FEHLT NOCH WAS
    }


    public void tauscheBueroMit(Mitarbeiter kollege)
    {
        // HIER FEHLT NOCH WAS
    }
}
