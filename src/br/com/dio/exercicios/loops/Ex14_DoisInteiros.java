package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo compreendido por eles.
*/
public class Ex14_DoisInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma = 0;

        System.out.println("Numero 1: ");
        numero1 = scan.nextInt();
        System.out.println("Numero 2: ");
        numero2 = scan.nextInt();

        System.out.println("Numeros do intervalo entre " + numero1 + " e " + numero2);


        if (numero1 <= numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println("" + i);
                soma += i;
            }
        } else {
            for (int i = numero2; i <= numero1; i++) {
                System.out.println("" + i);
                soma += i;

            }


        }
        System.out.println("A soma dos numeros do intervalo é " + soma);


    }


}
