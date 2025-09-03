import java.util.Scanner;

public class OppgaveO2 {
    
    public static String poengKarakter(int poeng) {
        String karakter = "";

        if ( poeng >= 90 && poeng <= 100) {      // A
            karakter = "A";
        } else if (poeng >= 80 && poeng <= 89) { // B
            karakter = "B";
        } else if (poeng >= 60 && poeng <= 79) { // C
            karakter = "C";
        } else if (poeng >= 50 && poeng <= 59) { // C
            karakter = "D";
        } else if (poeng >= 40 && poeng <= 49) { // C
            karakter = "E";
        } else if (poeng >= 0  && poeng <= 39) { // C
            karakter = "F";
        } 

        return karakter;
    }
    
    public static void main(String[] args) {
        int elevnr = 1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Poeng sum til elev nr: " + elevnr);
            int poeng = input.nextInt();
            String karakter_elev = poengKarakter(poeng);
            
            
            if (poeng > 100 || poeng < 0) {
                System.out.print("Poeng summen kan ikke være høyere enn 100 og mindre enn 0\n" + "Skriv poengsum på ny:");
            } else {
                System.out.println("Karakter til elev nr: " + elevnr + " er " + karakter_elev + "\n" +"=".repeat(30));
                elevnr++;
            }
            
        } while (elevnr <= 10);
        input.close();

    }
}
