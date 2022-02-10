package br.org.python.wiki;

//14) Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
// Não utilize a função de potência da linguagem.


import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base;
        int expoente;
        int i = 1;
        System.out.println("Digite a base da função: ");
        base = scan.nextInt();
        int resultado = base;
        System.out.println("Digite o expoente da função: ");
        expoente = scan.nextInt();

        do {
            resultado *= base;
            i++;
        }while (i < expoente);
        //A tratar. Ainda não imprime números grandes. mas entrega pequenas potências.
        System.out.println("Resultado: " + resultado);

    }
}
