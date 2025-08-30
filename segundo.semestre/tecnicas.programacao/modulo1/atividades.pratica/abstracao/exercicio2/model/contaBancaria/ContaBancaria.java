package model.contaBancaria;
public class ContaBancaria {
    public String  agencia, conta, tipoConta, nomeCliente, cpfCliente;

    public void exibirSaldo(String saldo){
        System.out.println("Seu saldo é de " + saldo);
    }
    public void realizarTransferencia(){

    }
    public void fazerPagamento(){

    }
    public void detalhes(){
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("CPF do Cliente: " + cpfCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
    }
}
