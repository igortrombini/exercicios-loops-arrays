package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
*/
public class Ex13_NumeroImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for (int i = 1; i <= 50; i++) {

            if (i % 2 != 0) {
                System.out.println("" + i);

            }


        }


    }


}
