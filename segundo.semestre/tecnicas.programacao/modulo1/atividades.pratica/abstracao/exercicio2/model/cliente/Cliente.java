package model.cliente;

public class Cliente {
    public String nome, cpf, telefone, email;
    public int idade;

    public void pagar(String metodo){
        System.out.println("Obrigado por pagar usando " + metodo);
        
    }
    public void avaliar(int estrelas){
        System.out.println("Eu vou avaliar em " + estrelas + " estrelas!");
    }
    public void consumir(){
        System.out.println("Consumindo....");
    }
    public void detalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-Mail: " + email);
        System.out.println("idade: " + idade + " anos");
    }
}
