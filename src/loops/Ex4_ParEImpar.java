package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int numero;
        int somaPares = 0, somaImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantidade = sc.nextInt();

        int cont = 0;
        do{
            System.out.println("Numero: ");
            numero = sc.nextInt();
            if(numero % 2 == 0) somaPares++;
            else somaImpares++;

            cont++;
        }while (cont < quantidade);

        System.out.println("Quantidade Par: " + somaPares);
        System.out.println("Quantidade Impar: " + somaImpares);
    }
}
