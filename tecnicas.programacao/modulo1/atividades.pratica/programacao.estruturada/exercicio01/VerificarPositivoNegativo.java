import java.util.Scanner;



public class VerificarPositivoNegativo {
  public static void main(String[] args) {
    int num;
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    num = scan.nextInt();
    if (num > 0) {
      System.out.println("O número é positivo!");
    } else if (num == 0) {
      System.out.println("O número é 0!");
    } else {
      System.out.println("O número é negativo!");
    }
  }
}