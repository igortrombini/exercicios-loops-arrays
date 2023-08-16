package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe a soma e a média dos números.
*/
public class Ex12_SomaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = (soma + numero);


        }
        System.out.println("A soma dos numeros é : " + soma);
        System.out.println("A média dos numeros é : " + (soma) / 5);


    }


}
