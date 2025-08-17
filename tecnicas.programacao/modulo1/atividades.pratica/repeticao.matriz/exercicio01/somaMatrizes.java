import java.util.Scanner;

public class somaMatrizes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] somaMatriz = new int[3][3];

        System.out.println("Add matriz 1");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Add o num na linha " + l + " e a coluna " + c);
                matrizA[l][c] = scan.nextInt();

            }
        }
        System.out.println("Add matriz 2");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Add o num na linha " + l + " e a coluna " + c);
                matrizB[l][c] = scan.nextInt();

            }
        }

        System.out.println("-------------------------------");
        System.out.println("Soma");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                somaMatriz[l][c] = (matrizA[l][c]) + (matrizB[l][c]);
                System.out.print(somaMatriz[l][c] + " ");

            }
            System.out.println(" ");
        }
    }
}
