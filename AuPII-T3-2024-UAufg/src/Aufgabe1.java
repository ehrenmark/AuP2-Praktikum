public class Aufgabe1 {
    public static void main(String[] args) {

        int x = -1;
        int y = 2;
        int z = 3;


        boolean isNegative = x < 0;
        assert isNegative : "Die Zahl x sollte negativ sein.";

        boolean isDivisibleByTwo = y % 2 == 0;
        assert isDivisibleByTwo : "Die Zahl y sollte durch 2 teilbar sein.";

        boolean isNonNegativeAndDivisibleByThree = z >= 0 && z % 3 == 0;
        assert isNonNegativeAndDivisibleByThree : "Die Zahl z sollte nicht negativ und durch 3 teilbar sein.";

        System.out.println("Alle Bedingungen wurden erfüllt.");


    }
}