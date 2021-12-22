package com.letscode.javabasico;


import java.util.Scanner;

public class Jogo {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String opcao="X";
        BemVinda.darBemVinda();//metodo de clase abtracta
        Tabuleiro meuTabuleiro = new Tabuleiro();
        while (!(opcao.equals("1") || opcao.equals("2"))) {

            System.out.println("Quer posicionar seus navios:");
            System.out.println("Opção 1-Aleatorio");
            System.out.println("Opção 2-Manual");
            opcao = input.next();
//Temos que faze a logica de que acontece
        };
        meuTabuleiro.gerarTabuleiroVazio();


        meuTabuleiro.exibirTabuleiro("pedro");
    }
}
