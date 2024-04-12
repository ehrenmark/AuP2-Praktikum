public class Aufgabe2a {

    public static void main(String[] args) {
        double x = 5.0;
        double y = 10.0;

        assert x != 0 && y != 0 : "X und Y sollten definierte Zahlen sein.";

        double m = (x + y) / 2;

        assert m == (x + y) / 2 : "m sollte der Mittelwert von X und Y sein.";

        System.out.println("Der Mittelwert von X und Y ist: " + m);
    }

}