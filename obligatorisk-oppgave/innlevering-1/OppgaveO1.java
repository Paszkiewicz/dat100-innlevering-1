/* Obligatorisk  Innlevering 1: Oppgave 1
 * Av: Bartosz Paszkiewicz */

public class OppgaveO1 {
    
    public static double beregneTrinnskatt(double bruttolonn) {
    
        double total_skatt       = 0.0;
        double[] trinn_prosent   = {1.7, 4.0, 13.7, 16.7, 17.7};
        int[] trinn_grense_nedre = {217401, 306051, 607151, 942401, 1410751};
        int[] trinn_grense_ovre  = {306050, 697150, 942400, 1410750, Integer.MAX_VALUE};

        for (int i = 0; i < 5; i++) {
            if (bruttolonn >= trinn_grense_nedre[i]) {
                if (bruttolonn <= trinn_grense_ovre[i]) {
                    total_skatt = total_skatt + ((trinn_prosent[i]/100) * (bruttolonn - trinn_grense_nedre[i]));
                } else {
                    total_skatt = total_skatt + ((trinn_prosent[i]/100) * (trinn_grense_ovre[i]-trinn_grense_nedre[i]));
                }
            } else {
                break;
            }
        }
        return Math.round(total_skatt);
    }

    public static String trinnSkatt(double bruttolonn) {
        double beregning = beregneTrinnskatt(bruttolonn);

        if (beregning > 0) {
            return "=".repeat(25) + "\nDin lønn: " + bruttolonn + "\nSkatt: " + beregning + "Kr\n" + "=".repeat(25);
        } else {
            return "Ingen trinnskatt: Lønnen er for lav!";
        }
    }

    public static void main(String[] args) {
        System.out.print("Skriv inn din lønn for trinnskatt: ");
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println(trinnSkatt(input.nextDouble()));
        input.close();
    }
}