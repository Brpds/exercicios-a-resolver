package br.org.python.wiki;

import java.util.Scanner;

//9) Faça um programa que leia 5 números e informe a soma e a média dos números.

public class Exercicio_9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int soma = 0;
        int media;
        int numero;

        while(count < 5) {
            count++;
            System.out.print("Digite um Número: ");
            numero = scan.nextInt();
            soma += numero;
            }
        media = soma/5;
        System.out.println("A média é: " + media);
    }
}

