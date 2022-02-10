package br.org.python.wiki;

/* 5) Altere o programa do Exercício 4 permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
 Valide a entrada e permita repetir a operação.*/

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scannerPopulacaoA = new Scanner(System.in);
        Scanner scannerPopulacaoB = new Scanner(System.in);
        Scanner scannerCrescimentoA = new Scanner(System.in);
        Scanner scannerCrescimentoB = new Scanner(System.in);
        double populacaoA;
        double populacaoB;
        double crescimentoDecimalA;
        double crescimentoDecimalB;
        double anosNecessarios = 0;

        System.out.println("Insira a população de A: ");
        populacaoA = scannerPopulacaoA.nextDouble();
        System.out.println("Insira o crescimento percentual de A: ");
        crescimentoDecimalA = scannerCrescimentoA.nextDouble();
        double crescimentoA = (1 + (crescimentoDecimalA/100));
        System.out.println("Insira a população de B: ");
        populacaoB = scannerPopulacaoB.nextDouble();
        System.out.println("Insira o crescimento percentual de B: ");
        crescimentoDecimalB = scannerCrescimentoB.nextDouble();
        double crescimentoB = (1 + (crescimentoDecimalB/100));
        

        do {
            anosNecessarios++;
        } while (populacaoA*Math.pow(crescimentoA, anosNecessarios) <= populacaoB*Math.pow(crescimentoB,anosNecessarios));
        System.out.println("A população de A supera B em " + anosNecessarios + " anos.");
    }
}
