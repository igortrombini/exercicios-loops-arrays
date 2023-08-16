package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que, dado um conjunto de N números, determine o menor valor,
o maior valor e a soma dos valores.
*/
public class Ex18_MenoreMaiorValor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Digite um conjunto de numeros: ");
        n = scan.nextInt();


        for (int i = 0; i < n; i++) {

            System.out.println("Digite o numero " + (i + 1) + ": ");
            int numero = scan.nextInt();

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }

            soma = soma+numero;


        }
        System.out.println("O Menor numero é " + menor);
        System.out.println("O Maior numero é " + maior);
        System.out.println(" A soma dos numeros é " + soma);

    }


}
