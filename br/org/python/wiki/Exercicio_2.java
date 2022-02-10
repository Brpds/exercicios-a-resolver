package br.org.python.wiki;

/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanUsuario = new Scanner(System.in);
        Scanner scanSenha = new Scanner(System.in);
        String usuario;
        String senha;
        System.out.println("Nome do usuário: ");
        usuario = scanUsuario.next();
        System.out.println("Senha: ");
        senha = scanSenha.next();
        while (usuario.equals(senha)){
            System.out.println("Usuário não pode ser igual à senha. Digite novamente. \nUsuário: ");
            usuario = scanUsuario.next();
            System.out.println("Senha: ");
            senha = scanSenha.next();
        }
        System.out.println("Usuário: " + usuario + "\nSenha: "+ senha);

    }
}
