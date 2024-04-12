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
        {
            if (this.buero != null) {
                this.buero.zieheBueroFrei();
            }
            this.buero = buero;
            buero.belegeMit(this);
        }
    }

    public void ausBueroZiehen() {
        if (this.buero != null) {
            Buero oldBuero = this.buero;
            this.buero = null;
            oldBuero.zieheBueroFrei();
        }
    }


    public void tauscheBueroMit(Mitarbeiter mitarbeiter) {
        if (mitarbeiter != null && mitarbeiter.gibBuero() != null && this.buero != null) {
            Buero tempBuero = this.buero;
            this.buero = mitarbeiter.gibBuero();
            mitarbeiter.buero = tempBuero;
        }
    }

    public void zieheBueroFrei() {
        if (this.buero != null) {
            Buero oldBuero = this.buero;
            this.buero = null;
            oldBuero.zieheBueroFrei();
        }
    }
}
