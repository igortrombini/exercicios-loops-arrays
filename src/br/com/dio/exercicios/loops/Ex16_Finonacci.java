package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo.
*/
public class Ex16_Finonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 100;
        int termoAnterior = 1;
        int termoAtual = 1;


        for (int i = 3; i <= n; i++) {
            int proximoTermo = termoAnterior + termoAtual;
            System.out.println(proximoTermo + "");
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;

        }


    }


}
