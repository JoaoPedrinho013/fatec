package view;

import model.aplicativo.Aplicativo;
import model.arquivo.Arquivo;
import model.aula.Aula;

public class Main {
    public static void main(String[] args) {

        {   Aplicativo freeFire = new Aplicativo();
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

    }
}