package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
FFaça um programa que peça dois números, base e expoente, calcule e mostre o
primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
*/
public class Ex15_BaseExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base;
        int expoente;
        int resultado = 1;

        System.out.println("Base do numero : ");
        base = scan.nextInt();
        System.out.println("Expoente : ");
        expoente = scan.nextInt();

        for (int i = 0; i < expoente; i++) {
            resultado *= base;

        }

        System.out.println(base + " elevado a Expoente " +expoente+ "é igual a " +resultado);


    }


}
