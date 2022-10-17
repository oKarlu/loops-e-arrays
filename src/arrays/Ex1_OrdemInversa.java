package arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {5, 4, 8, -5, 7, -10};

        System.out.println("tamanho do vetor:" + vetor.length);

        int count = 0;
        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;

        }

        System.out.println();
        for(int i = 0 ; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        System.out.println();
        //ordem inversa com while
        count = vetor.length;
        while(count == 0) {
            count--;
            System.out.print(vetor[count] + " ");

        }

        //ordem inversa com for
        System.out.println();
        for(int i = vetor.length - 1; i > 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
