package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;
            soma = soma + numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("O maior numero é : " +maior);
        System.out.println("A média dos numeros é : " +soma/5);


    }
}
