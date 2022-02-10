package br.org.python.wiki;

//10) Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

public class Exercicio_10 {
    public static void main(String[] args) {
        int impares =0;
        while (impares <=50) {
            if (impares % 2 !=0)
            System.out.println(impares);
            impares++;
        }
    }
}
