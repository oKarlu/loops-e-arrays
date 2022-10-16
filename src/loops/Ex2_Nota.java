package loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite o número: ");
        nota = sc.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota Invalida! Digite novamente!");
            nota = sc.nextInt();
        }
    }
}
