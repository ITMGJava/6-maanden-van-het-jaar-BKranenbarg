import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {
        //variabele s voor gebruikersinvoer getal
        Scanner s = new Scanner(System.in);
        System.out.println("Voer een getal tussen de 1 en de 12 in");
        //koppel de variabele getal aan het ingevoerde getal
        int getal = s.nextInt();
        String maand;
        String connect = " is de maand ";


        //switch statement
        switch (getal) {
            case 1:
                maand = "januari";
                break;
            case 2:
                maand = "februari";
                break;
            case 3:
                maand = "maart";
                break;
            case 4:
                maand = "april";
                break;
            case 5:
                maand = "mei";
                break;
            case 6:
                maand = "juni";
                break;
            case 7:
                maand = "juli";
                break;
            case 8:
                maand = "augustus";
                break;
            case 9:
                maand = "september";
                break;
            case 10:
                maand = "oktober";
                break;
            case 11:
                maand = "november";
                break;
            case 12:
                maand = "december";
                break;
            default:
                System.out.println("foutieve invoer: exciting!");
                maand = "dacht het niet";
                connect = " Wat dacht je zelf? ";
                break;

        }
        System.out.println(getal + connect + maand);


    }
}
