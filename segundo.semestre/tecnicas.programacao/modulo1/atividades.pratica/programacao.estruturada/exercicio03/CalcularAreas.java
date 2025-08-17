import java.util.Scanner;

public class CalcularAreas {

    public static void main(String[] args){
        int numCalculo;
        double base, altura, raio;
        Scanner scan = new Scanner(System.in);


        System.out.println("----------Cálculo de Áreas----------");
        System.out.println("");
        System.out.println("Digite 1 para calcular a area de um quadrado.");
        System.out.println("Digite 2 para calcular a area de um circulo.");
        System.out.println("");

        System.out.print("Qual sua opção? ");
        numCalculo = scan.nextInt();

        if (numCalculo == 1) {
            System.out.println("----------Calcular Área de um Quadrado----------");
            System.out.println("");
            System.out.print("Qual tamanho da base em cm? ");
            base = scan.nextDouble();
            System.out.print("Qual tamanho da altura em cm? ");
            altura = scan.nextDouble();
            System.out.println("");
            System.out.println("A Área desse quadrado é de " + (base*altura) + "cm²");


        } else if (numCalculo == 2){
            System.out.println("----------Calcular Área de um Círculo----------");
            System.out.println("");
            System.out.print("Qual tamanho do raio em cm? ");
            raio = scan.nextDouble();
            System.out.println("");
            double areaCirculo = 3.14 * (raio * raio);
            System.out.printf("A Área desse círculo é de %.2f cm².", areaCirculo);
        } else {
            System.out.println("Melhore...");
        }
    }
    
}
