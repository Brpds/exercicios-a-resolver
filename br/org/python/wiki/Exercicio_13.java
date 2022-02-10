package br.org.python.wiki;

//13) Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 X 1 = 5
//5 X 2 = 10
//...
//5 X 10 = 50

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;
        int multiplicador = 1;
        System.out.println("Digite o número para ver a tabuada: ");
        tabuada = scan.nextInt();
        while (multiplicador <= 10){
            System.out.println(tabuada + " X " + multiplicador + " = " + (multiplicador*tabuada));
            multiplicador++;
        }
    }

}
