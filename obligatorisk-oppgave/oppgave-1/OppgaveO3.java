import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {
        long total = 1;

        System.out.println("Input a number between 1 and 20: ");
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        
        System.out.println(total);
        input.close();
    }
}