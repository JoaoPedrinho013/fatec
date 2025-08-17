﻿using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_1_logica_condicao
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* 2. Cálculo de um salário líquido de um professor.
             * Serão fornecidos via teclado o valor da hora aula,
             * número de aulas dadas e o % de desconto do INSS. */

            double hora_aula, aulas_dadas, porcentagem_desconto_inss;
            double salario_bruto, salario_liquido;

            Console.Write("Quanto você cobra da sua aula por hora? ");
            hora_aula = Convert.ToDouble(Console.ReadLine());

            Console.Write("Quantas aulas você fez? ");
            aulas_dadas = Convert.ToDouble(Console.ReadLine());

            Console.Write("Qual a % de desconto do INSS? ");
            porcentagem_desconto_inss = Convert.ToDouble(Console.ReadLine());


            salario_bruto = hora_aula * aulas_dadas;

            salario_liquido = salario_bruto * (1 - (porcentagem_desconto_inss / 100));

            Console.WriteLine("--------------------------------------------------------------");
            Console.WriteLine($"O professor deu {aulas_dadas} aulas, e por hora recebeu R${hora_aula:F2}.");
            Console.WriteLine("--------------------------------------------------------------");
            Console.WriteLine($"Seu salário bruto foi de R${salario_bruto:F2}.");
            Console.WriteLine("--------------------------------------------------------------");
            Console.WriteLine($"E com desconto de {porcentagem_desconto_inss}% do INSS ele ficou com R${salario_liquido:F2} líquido.");
            Console.WriteLine("--------------------------------------------------------------");


            Console.ReadLine();


        }
    }
}
