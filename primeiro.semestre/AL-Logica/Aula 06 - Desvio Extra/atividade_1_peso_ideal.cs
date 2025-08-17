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
            /* 1. Tendo como dados de entrada a altura e o sexo de uma pessoa ("masculino" e "feminino"),
            construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
            a. para homens: (72.7*h)-58
            b. para mulheres: (62.1*h)-44.7 */


            double altura, peso_ideal;
            string sexo;
            Console.Write("Qual sua altura (metros) ? ");
            altura = Convert.ToDouble(Console.ReadLine());
            Console.Write("Qual seu sexo? ");
            sexo = Console.ReadLine().ToLower();

            if (sexo == "masculino" || sexo == "m" || sexo == "masc")
            {
                peso_ideal = (72.7 * altura) - 58;
            } 
            else if (sexo == "feminino" || sexo == "f" || sexo == "fem")
            {
                peso_ideal = (62.1 * altura) - 44.7;
            } else
            {
                Console.Write("Sexo inválido");
                return;
            }
            Console.WriteLine("------------------------------------------------------------------------------------");
            Console.WriteLine($"Olá, você é do sexo {sexo} e seu peso ideal, baseado na sua altura '{altura}m' é de {peso_ideal:F2}kg. ");
            Console.WriteLine("------------------------------------------------------------------------------------");


            Console.ReadLine();


        }
    }
}
