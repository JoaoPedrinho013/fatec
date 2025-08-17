import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----- TABUADA -----");

        System.out.print("Digite um número para tábuada: ");
        num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num+"x"+i+" = "+(num * i));
        }
    }
}
