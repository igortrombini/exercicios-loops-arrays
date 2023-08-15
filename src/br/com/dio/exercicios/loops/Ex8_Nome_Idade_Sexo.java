package br.com.dio.exercicios.loops;

import java.util.Scanner;


/*
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
*/
public class Ex8_Nome_Idade_Sexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Digite um nome");
            nome = scan.nextLine();

        } while (nome.length() <= 3);
        do {
            System.out.println("Digite uma idade de 0 a 150");
            idade = scan.nextInt();
        } while (idade < 0 || idade > 150);
        do {
            System.out.println("Digite seu salario(maior que zero) : ");
            salario = scan.nextDouble();

        } while (salario <= 0);
        do {
            System.out.println("Digite o Sexo (F) para feminino e (M) para masculino: ");
            sexo = scan.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
        do {
            System.out.println("Digite o estado civil (S),(C),(V),(D) : ");
            estadoCivil = scan.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\n Informações Validas : ");
        System.out.println("Nome : " +nome);
        System.out.println("Idade : " +idade);
        System.out.println("Salario : " +salario);
        System.out.println("Sexo : " +sexo);
        System.out.println("Estado Civil : " +estadoCivil);


    }
}
