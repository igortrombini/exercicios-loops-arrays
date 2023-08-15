package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros, numeros;
        int count = 0;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de Numeros: ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numeros = scan.nextInt();
            count++;

            if(numeros % 2 == 0) qtdPares++;
            else qtdImpares++;

        } while (count < qtdNumeros);

        System.out.println("A quantidade de numeros pares é : "+qtdPares);
        System.out.println("A quantidade de numeros impares é : "+qtdImpares);
    }
}
