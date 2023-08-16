package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo.
*/
public class Ex17_Fibonacci_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int termoAnterior = 1;
        int termoAtual = 1;


        for (int proximoTermo = termoAnterior + termoAtual; proximoTermo <= 500; ) {

            System.out.println(proximoTermo + "");
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
            proximoTermo = termoAnterior + termoAtual;

        }


    }


}
