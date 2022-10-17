package arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = rand.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        //for-each para imprimir o array
        System.out.println("Numeros aleatorios");
        for(int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores");
        for(int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nAntecessores");
        for(int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
