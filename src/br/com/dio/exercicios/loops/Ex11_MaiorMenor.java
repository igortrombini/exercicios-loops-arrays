package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número.
*/
public class Ex11_MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;


        }
        System.out.println("O maior numero é : " +maior);


    }


}
