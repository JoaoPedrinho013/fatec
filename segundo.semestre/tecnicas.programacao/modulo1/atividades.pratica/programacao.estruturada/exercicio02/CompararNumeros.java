import java.util.Scanner;

public class CompararNumeros {
    public static void main(String [] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Os dois números são iguais, portanto nenhum é maior que o outro.");
        } else if (num1 > num2 ){
            System.out.println("Os dois números são diferentes. O número " + num1 + " é maior, e o número " + num2 + " é menor.");
        }else{
            System.out.println("Os dois números são diferentes. O número " + num2 + " é maior e o número " + num1 +" é menor.");
        }
    }
}