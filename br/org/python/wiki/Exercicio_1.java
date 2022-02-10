package br.org.python.wiki;


import java.util.Scanner;

/*1) Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
* Exercício Básico, sem tratamento de exceções.*/
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 - 10: ");
        int nota = scan.nextInt();
        while(nota > 10 | nota < 0){
            System.out.println("Erro! Digite uma nota válida entre 0 e 10, sem decimais.");
            nota = scan.nextInt();
        }
        System.out.println("Nota: " + nota);

    }
}
