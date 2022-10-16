package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int cont = 0;
        double soma = 0;
        int maior = 0;

        do{
            System.out.println("Numero: ");
            numero = scanner.nextInt();
            soma += numero;
            cont++;
            if(numero > maior) maior = numero;
        }while(cont < 5);

        System.out.println("Media: " + soma / cont);
        System.out.println("Maior numero: " + maior);
    }
}
