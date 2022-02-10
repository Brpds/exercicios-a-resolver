package br.org.python.wiki;

//11) Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner scanInicial = new Scanner(System.in);
        Scanner scanFinal = new Scanner(System.in);
        int valorInicial;
        int valorFinal;


        System.out.println("Valor inicial: ");
        valorInicial = scanInicial.nextInt();
        System.out.println("Valor final: ");
        valorFinal = scanFinal.nextInt();

        while (valorInicial < valorFinal - 1) {
            System.out.println(valorInicial+1);
            valorInicial++;
        }

    }
}
