package br.org.python.wiki;
/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; */

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scanNome = new Scanner(System.in);
        Scanner scanIdade = new Scanner(System.in);
        Scanner scanSalario = new Scanner(System.in);
        Scanner scanSexo = new Scanner(System.in);
        Scanner scanEstadoCivil = new Scanner(System.in);
        String nome;
        int idade;
        int salario;
        String sexo;
        String estadoCivil;

        System.out.println("Insira um nome: ");
        nome = scanNome.next();
        while (nome.length() <= 3){
            System.out.println("Nomes válidos devem ter mais que 3 caracteres. Tente Novamente! \nNome: ");
            nome = scanNome.next();
        }

        System.out.println("Insira a idade: ");
        idade = scanIdade.nextInt();
        while (idade < 0 | idade > 150){
            System.out.println("Idade inválida! A idade deve estar entre 0 e 150 anos. Tente novamente! \nIdade: ");
            idade = scanIdade.nextInt();
        }

        System.out.println("Digite o salário: ");
        salario = scanSalario.nextInt();
        while (salario <= 0){
            System.out.println("Salário inválido. O salário deve ser maior que 0. Tente novamente! \nSalário: ");
            salario = scanSalario.nextInt();
        }

        System.out.println("Digite o sexo: ");
        sexo = String.valueOf(scanSexo.next());
        while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo inválido. O sexo deve ser m ou f. Tente novamente! \nSexo: ");
            sexo = scanSexo.next();
        }

        System.out.println("Digite estado civil: ");
        estadoCivil = scanEstadoCivil.next();
        while (!estadoCivil.equalsIgnoreCase("s") &&
                !estadoCivil.equalsIgnoreCase("c") &&
                !estadoCivil.equalsIgnoreCase("v") &&
                !estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Estado Civil inválido! Deve ser s, c, v ou d. Tente novamente! \nEstado Civil: ");
            estadoCivil = scanEstadoCivil.next();
        }
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSalário: " + salario + "\nSexo: " + sexo +
                "\nEstado Civil: " + estadoCivil);
    }
}
