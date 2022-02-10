package br.org.python.wiki;

//8) Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int maiorNumero = Integer.MIN_VALUE;
        int numero;

        while(count < 5) {
            count++;
            System.out.print("Digite um Número: ");
            numero = scan.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
                System.out.println("Maior Número até agora: " + maiorNumero);
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}

