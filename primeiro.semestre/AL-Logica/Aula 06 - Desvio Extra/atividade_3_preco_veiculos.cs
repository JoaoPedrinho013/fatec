﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace atividade_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* 
             * 3.O custo ao consumidor de um carro novo é a soma do preço da fábrica com o
             * percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica.
             * Faça um programa que receba o preço de fábrica de um veículo, o percentual de
             * lucro do distribuidor e o percentual de impostos. Calcule e mostre:
             * a. O valor correspondente ao lucro do distribuidor
             * b. O valor correspondente aos impostos
             * c. O preço final do veículo
             */

            double preco_fabrica, percentual_lucro, percentual_imposto;

            Console.Write("Digite o preço de fábrica do veículo: ");
            preco_fabrica = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o percentual de lucro do distribuidor: ");
            percentual_lucro = Convert.ToDouble(Console.ReadLine());

            Console.Write("Digite o percentual de Impostos: ");
            percentual_imposto = Convert.ToDouble(Console.ReadLine());

            double lucro_distribuidor = preco_fabrica * (percentual_lucro / 100);
            double imposto_final = preco_fabrica * (percentual_imposto / 100);
            double preco_final_veiculo = preco_fabrica + lucro_distribuidor + imposto_final;

            Console.WriteLine("--------------------------------------------------------------");
            Console.WriteLine($"O valor correspondente ao lucro do distribuidor é R${lucro_distribuidor:F2}.");
            Console.WriteLine("--------------------------------------------------------------");
            Console.WriteLine($"O valor correspondente ao Imposto é R${imposto_final:F2}.");
            Console.WriteLine("--------------------------------------------------------------");
            Console.WriteLine($"O valor final do veículo é R${preco_final_veiculo:F2}.");
            Console.WriteLine("--------------------------------------------------------------");

            Console.ReadLine();

        }
    }
}
