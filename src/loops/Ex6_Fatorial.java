package loops;


/*
Ex fatorial: 5
5 * 4 * 3 * 2 * 1 = 120
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial do numero: ");
        int fatorial = sc.nextInt();

        for (int i = fatorial-1; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("Fatorial = " + fatorial);
    }
}
