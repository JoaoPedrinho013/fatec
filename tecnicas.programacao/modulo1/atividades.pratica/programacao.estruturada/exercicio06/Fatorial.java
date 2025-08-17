import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para calcular o Fatorial: ");
        num = scan.nextInt();
        // 5! = 5 x 4 x 3 x 2 x 1
        int somador = 1;
        for(int i = 2; i <= num; i++){
            somador *= i;
        }
        System.out.println("O fatorial de "+ num + " é " + somador);
        
    }
}
