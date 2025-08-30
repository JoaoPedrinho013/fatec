package model.arquivo;

public class Arquivo {
    public String nome, tipoArquivo;
    public double tamanho;
    public boolean ativo = false;

    public void criar() {
        if (!ativo) {
            System.out.println("Arquivo criado!");
            ativo = true;
        } else {
            System.out.println("Esse arquivo já existe.");
        }
    }

    public void editar() {
        if (ativo) {
            System.out.println("Abrindo edição de arquivo.");
        } else {
            System.out.println("Arquivo inexistente, vou criar um.");
            criar();
            editar();
        }
    }

    public void deletar() {
        if (ativo) {
            System.out.println("Arquivo deletado.");
            ativo = false;
        }else{
            System.out.println("Arquivo inexistente.");
        }
    }

    public void detalhes() {
        System.out.println("Nome do Arquivo: " + nome);
        System.out.println("Tipo do Arquivo: " + tipoArquivo);
        System.out.println("Tamanho do Arquivo: " + tamanho + "GBs");
    }
}
