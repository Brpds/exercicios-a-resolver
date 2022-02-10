package br.org.python.wiki;

/* 4) Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
 e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
 Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
 ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/

public class Exercicio_4 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        double crescimentoA = 1.03;
        double crescimentoB = 1.015;
        double anosNecessarios = 0;

        do {
            anosNecessarios++;
        } while (populacaoA*Math.pow(crescimentoA, anosNecessarios) <= populacaoB*Math.pow(crescimentoB,anosNecessarios));
        System.out.println("A população de A supera B em " + anosNecessarios + " anos.");
    }
}
