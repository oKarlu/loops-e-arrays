package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabuada = 0;

        System.out.print("Tabuada: ");
        tabuada = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada  + " x " + i + " = " + (tabuada * i));
        }
    }
}
