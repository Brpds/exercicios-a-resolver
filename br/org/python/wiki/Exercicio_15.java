package br.org.python.wiki;

// 15) Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int numerosImpares = 0;
        int numerosPares = 0;
        int count = 0;

        do {
            System.out.println("Insira um número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0){
                numerosPares++;
            }else {
                numerosImpares++;
            }
            count++;
        }while (count <10);


        //System.out.println("O número é: " + numero);
        System.out.println("O total de pares é: " + numerosPares);
        System.out.println("O total de números ímpares é: " + numerosImpares);
    }
}
