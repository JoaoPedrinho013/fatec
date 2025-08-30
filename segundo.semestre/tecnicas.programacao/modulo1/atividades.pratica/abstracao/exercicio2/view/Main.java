package view;

import model.aplicativo.Aplicativo;
import model.arquivo.Arquivo;
import model.aula.Aula;
import model.avaliacao.Avaliacao;
import model.bancoDados.BancoDados;
import model.cliente.Cliente;
import model.contaBancaria.ContaBancaria;

public class Main {
    public static void main(String[] args) {

       /* {   Aplicativo freeFire = new Aplicativo();
            freeFire.nome = "Free Fire";
            freeFire.categoria = "Tiro";
            freeFire.desenvolvedor = "Garena";
            freeFire.tamanho = 13.42;
            freeFire.versao = "2.32.3";
            
            freeFire.executar();
            freeFire.instalador();
            freeFire.executar();
            freeFire.desinstalador();
            freeFire.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Aplicativo mobileLegends = new Aplicativo();
            mobileLegends.nome = "Mobile Legends Bang Bang";
            mobileLegends.categoria = "Moba";
            mobileLegends.desenvolvedor = "Moonton";
            mobileLegends.tamanho = 23.37;
            mobileLegends.versao = "1.23.2";

            mobileLegends.executar();
            mobileLegends.instalador();
            mobileLegends.executar();
            mobileLegends.desinstalador();
            mobileLegends.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Arquivo fotoSecretas = new Arquivo();
            fotoSecretas.nome = "Foto Secreta";
            fotoSecretas.tipoArquivo = ".png";
            fotoSecretas.tamanho = 1.1;

            fotoSecretas.editar();
            fotoSecretas.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Arquivo videoSecreto = new Arquivo();
            videoSecreto.nome = "Video Secreto";
            videoSecreto.tipoArquivo = ".mp4";
            videoSecreto.tamanho = 2.3;

            videoSecreto.editar();
            videoSecreto.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Aula tecnicasProg = new Aula();
            tecnicasProg.professor = "Alessandro";
            tecnicasProg.material = "Notebook/Computador com Umbuntu";
            tecnicasProg.gradeCurricular = "Abstração, Encapsulamento, Herança e Polimorfismo";
            tecnicasProg.cargaHoraria = 20;

            tecnicasProg.calcularMedia(10, 0.7, 3.3);
            tecnicasProg.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Aula estruturaDados = new Aula();
            estruturaDados.professor = "Fernanda";
            estruturaDados.material = "Notebook/Computador com internet";
            estruturaDados.gradeCurricular = "Array, Matriz, Classes, Métodos, Objetos, etc...";
            estruturaDados.cargaHoraria = 20;

            estruturaDados.calcularMedia(9.7, 9.1, 7.3);
            estruturaDados.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Avaliacao bancoDados = new Avaliacao();
            bancoDados.aluno = "João Pedro";
            bancoDados.materia = "Banco de Dados Relacional";
            bancoDados.regras = "Sem consulta e sem colar";
            bancoDados.gabarito = "1-B, 2-C, 3-A, 4-E, 5-D";
            bancoDados.tempoLimite = 1.30;
            
            bancoDados.preencherGabarito("1-B", "2-C", "3-A", "4-E", "5-D");
            bancoDados.detalhes();
        }
        System.out.println("###---###---###---###---###");
        {   Avaliacao web2 = new Avaliacao();
            web2.aluno = "João Pedro";
            web2.materia = "Desenvolvimento web 2";
            web2.regras = "Sem consulta e sem colar";
            web2.gabarito = "1-E, 2-C, 3-C, 4-E, 5-D";
            web2.tempoLimite = 1.30;
            
            web2.preencherGabarito("1-B", "2-C", "3-A", "4-E", "5-D");
            web2.detalhes();
        }
        System.out.println("###---###---###---###---###");
        BancoDados postgresql = new BancoDados();
        postgresql.nomeBanco = "PostgreSQL";
        postgresql.tipoBanco = "SQL";
        postgresql.quantidadeTabela = 3;
        postgresql.dataCriacao = "11/11/2001";
        postgresql.dataAtualizacao = "11/11/2001";

        postgresql.conectarBanco();
        postgresql.detalhes();

        System.out.println("###---###---###---###---###");

        BancoDados mongoDB = new BancoDados();
        mongoDB.nomeBanco = "MongoDB";
        mongoDB.tipoBanco = "NoSQL";
        mongoDB.quantidadeTabela = 5;
        mongoDB.dataCriacao = "12/12/2006";
        mongoDB.dataAtualizacao = "12/12/2006";

        mongoDB.conectarBanco();
        mongoDB.detalhes();

        System.out.println("###---###---###---###---###"); 

        Cliente pedro = new Cliente();
        pedro.nome = "Pedro";
        pedro.cpf = "874.742.321-76";
        pedro.telefone = "(13)4002-8922";
        pedro.email = "pedro.fatec.sp.gov.br";
        pedro.idade = 21;

        pedro.pagar("Pix");
        pedro.detalhes();

        System.out.println("###---###---###---###---###");

        Cliente joao = new Cliente();
        joao.nome = "João";
        joao.cpf = "874.742.321-76";
        joao.telefone = "(13)4002-8922";
        joao.email = "joao.fatec.sp.gov.br";
        joao.idade = 31;

        joao.avaliar(5);
        joao.detalhes();

        System.out.println("###---###---###---###---###"); */

        ContaBancaria pedro = new ContaBancaria();
        pedro.agencia = "Pedro";
        pedro.conta = "874.742.321-76";
        pedro.tipoConta = "(13)4002-8922";
        pedro.nomeCliente = "pedro.fatec.sp.gov.br";
        pedro.cpfCliente = "874.742.321-76";

        pedro.exibirSaldo("R$23,547,00");
        pedro.detalhes();

        System.out.println("###---###---###---###---###");

        ContaBancaria joao = new ContaBancaria();
        joao.agencia = "João";
        joao.conta = "874.742.321-76";
        joao.tipoConta = "(13)4002-8922";
        joao.nomeCliente = "joao.fatec.sp.gov.br";
        joao.cpfCliente = "874.742.321-76";


        joao.exibirSaldo("R$130,03,00");
        joao.detalhes();

        System.out.println("###---###---###---###---###");
    
    }
}