import java.util.Scanner;

public class SomaNumImpar {


    public static void somaNumImpar (){
         int numero, soma = 1, resultado = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero = scan.nextInt();
        
        for(int contador = 1; contador <= numero; contador++ ){
            resultado += soma;
            if(contador != numero){
                System.out.print(soma + " + ");
            }
            else{
                System.out.print(soma);
            }
            soma+=2;
        }
          System.out.print(" = " + resultado);
    }
    
    public static void somaNumImpar2 (){
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        
        System.out.println(num * num);
    }
    public static void main (String[] args) {
        somaNumImpar();
        somaNumImpar2();

    }
}
