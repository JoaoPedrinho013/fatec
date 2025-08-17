import java.util.Scanner;

public class transposicaoMatriz {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int[][] matrizTrocada = new int[3][3];

    for(int l = 0; l < 3; l++){
        for(int c = 0; c < 3; c++){
            System.out.print("Add na linha " + l + " e coluna " + c + ": ");
            matriz[l][c] = scan.nextInt();
        }
    }
    for(int l = 0; l < 3; l++){
        for(int c = 0; c < 3; c++){
            matrizTrocada[l][c] = matriz[c][l];
            System.out.print(matrizTrocada[l][c] + " ");
        }
        System.out.println(" ");
    }
  }  
}
