package model.avaliacao;

public class Avaliacao {
    public String aluno, materia, regras, gabarito;
    public double tempoLimite;

    public void preencherGabarito(String q1,String q2,String q3,String q4,String q5){
        System.out.println("Gabarito: ");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
        System.out.println(q5);
    }
    public void escrever(String texto){
        System.out.println("Escrevendo...");
        System.out.println(texto);
    }
    public void apagar(){
        System.out.println("Mensagem apagada...");
    }

    public void detalhes(){
        System.out.println("Aluno: " + aluno);
        System.out.println("Matéria: " + materia);
        System.out.println("Regras: " + regras);
        System.out.println("Gabarito: " + gabarito);
        System.out.println("Tempo Limite: " + tempoLimite + "Hrs");
    }

}
