// import java.util.Scanner;

import java.util.Scanner;

public class SenhaSecreta {
    public static String validacao() {
        String senhaScreta = "PaoComOvo123", senha;
        Boolean verificador = false;
        Scanner scan = new Scanner(System.in);

        while (verificador != true) {
            System.out.print("Digite a senha para logar: ");
            senha = scan.nextLine();
            if (senha.equals(senhaScreta)){
                verificador = true;
            } else {
                System.out.println("Senha inválida, tente novamente.");
            }
        }
        return "Parabéns você logou!";
    }

    public static void main(String[] args) {
        String logar = validacao();
        System.out.println(logar);
    }

}
