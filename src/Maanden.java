import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {
        //variabele s voor gebruikersinvoer getal
        var s = new Scanner(System.in);
        System.out.println("Voer een getal tussen de 1 en de 12 in");
        //koppel de variabele getal aan het ingevoerde getal
        var getal = s.nextInt();
        //switch statement
        switch (getal) {
            case 1:
                System.out.println("januari");
                break;
            case 2:
                System.out.println("februari");
                break;
            case 3:
                System.out.println("maart");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("mei");
                break;
            case 6:
                System.out.println("juni");
                break;
            case 7:
                System.out.println("juli");
                break;
            case 8:
                System.out.println("augustus");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("oktober");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("foutieve invoer");
        }


    }
}
