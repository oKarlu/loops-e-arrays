package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        /* usando for
        for(int i = 0; i < consoantes.length; i++){
            if(consoantes[i] != null){
                System.out.print(consoantes[i] + " ");
            }

        }
        */

        //for-each
        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }
}
