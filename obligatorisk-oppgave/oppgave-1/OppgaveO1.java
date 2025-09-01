public class OppgaveO1 {

    public static Number[] beregneTrinnskatt(double bruttolonn) {

        int trinn;
        double prosent;
        double skatt;

        if (bruttolonn >= 217401 && bruttolonn <= 306050) {
            trinn = 1;
            prosent = 1.7;
            skatt = bruttolonn * (prosent/100);
        } else if (bruttolonn >= 306051 && bruttolonn <= 607150) {
            trinn = 2;
            prosent = 4.0;
            skatt = bruttolonn * (prosent/100);
        } else if (bruttolonn >= 607151 && bruttolonn <= 942400) {
            trinn = 3;
            prosent = 13.7;
            skatt = bruttolonn * (prosent/100);
        } else if (bruttolonn >= 942401 && bruttolonn <= 1410750) {
            trinn = 4;
            prosent = 16.7;
            skatt = bruttolonn * (prosent/100);
        } else if (bruttolonn >= 1410751) {
            trinn = 5;
            prosent = 17.7;
            skatt = bruttolonn * (prosent/100);
        } else {
            trinn = 0;
            skatt = 0;
            prosent = 0;
        }

        final Number[] trinnskatt = new Number[3];

        skatt = Math.round(skatt);

        trinnskatt[0] = trinn;
        trinnskatt[1] = skatt;
        trinnskatt[2] = prosent;

        return trinnskatt;
    }

    public static String trinnSkatt(double bruttolonn) {
        Number[] beregning = beregneTrinnskatt(bruttolonn);

        if (beregning[0].intValue() > 0) {
            return "=".repeat(15) + "\nDin lønn: " + bruttolonn + "\nTrinn: " +  beregning[0] + "\nProsent: " + beregning[2] + "\nSkatt: " + beregning[1] + "Kr\n" + "=".repeat(15);
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