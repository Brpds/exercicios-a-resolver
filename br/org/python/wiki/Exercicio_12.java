package br.org.python.wiki;

import java.util.Scanner;

//12) Altere o programa do exercício 11 para mostrar no final a soma dos números.

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner scanInicial = new Scanner(System.in);
        Scanner scanFinal = new Scanner(System.in);
        int valorInicial;
        int valorFinal;
        int soma = 0;


        System.out.println("Valor inicial: ");
        valorInicial = scanInicial.nextInt();
        System.out.println("Valor final: ");
        valorFinal = scanFinal.nextInt();

        while (valorInicial < valorFinal - 1) {
            System.out.println(valorInicial+1);
            valorInicial++;
            soma += valorInicial;
        }
        System.out.println("A soma dos valores é: " + soma);

    }
}
