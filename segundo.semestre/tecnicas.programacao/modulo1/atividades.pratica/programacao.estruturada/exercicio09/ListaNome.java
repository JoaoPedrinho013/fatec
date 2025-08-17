import java.util.Scanner;


public class ListaNome {

        
    public static String[] addNames() {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scan.nextLine().toLowerCase();
        }
        System.out.println("------------------------------");
        System.out.println("Nomes adcionados!");
        System.out.println("------------------------------");
        return nomes;
    }
    
    public static void verificarName() {
        Scanner scan = new Scanner(System.in);
        String n;
        boolean verificador=false;
        String[] lista = addNames();

        System.out.println("Digite um nome para ver se está junto com os demais: ");
        n = scan.nextLine();
        
        for (String nome : lista) {
            if(nome.equals(n.toLowerCase())) {
                verificador = true;
            }
        }

        if (verificador != false){
            System.out.println("Existe esse nome na Lista!");
        } else {
            System.out.println("Não Existe esse nome na Lista!");
        }

    }



    public static void main(String[] args) {
        verificarName();
    }
}
