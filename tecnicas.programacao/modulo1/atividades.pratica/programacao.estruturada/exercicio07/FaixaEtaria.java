import java.util.Scanner;

public class FaixaEtaria {
    public static void main (String[] args) {
        int idade;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();

        if (idade <= 0) {
            System.out.println("Digite uma idade válida.");
        } else if ( idade < 18) {
            System.out.println("Você é Menor de Idade!");
        } else if ( idade < 60) {
            System.out.println("Você é Adulto!");
        } else {
            System.out.println("Você é Idoso!");
        }
    }
}