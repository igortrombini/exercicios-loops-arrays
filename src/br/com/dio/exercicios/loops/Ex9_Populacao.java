package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B
seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a
população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
*/
public class Ex9_Populacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int paisA = 80000, paisB = 200000;
        double txA = 0.003, txB = 0.015;
        int anos = 0;

        while (paisA <= paisB) {
            paisA += (int) (paisA * txA);
            paisB += (int) (paisB * txB);
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");

    }
}
