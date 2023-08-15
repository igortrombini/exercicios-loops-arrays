package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do
usuário, mostrando uma mensagem de erro e voltando a pedir as informações

*/
public class Ex7_Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String senha, usuario;


        while (true) {

            System.out.println("Usuario: ");
            usuario = scan.next();
            System.out.println("Senha: ");
            senha = scan.next();
            if (usuario.equals(senha))
                System.out.println("Usuario e Senha iguais digite as informações novamente");
        }


    }
}
