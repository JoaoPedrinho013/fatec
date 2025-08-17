import java.util.Scanner;

public class VerificarParImpar {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro para saber se é impar ou par: ");
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é PAR!");
        } else {
            System.out.println("O número " + num + " é ÍMPAR!");
        }
    }
}
