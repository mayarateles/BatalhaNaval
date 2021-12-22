package com.letscode.javabasico;


import java.util.Scanner;

public class Jogo {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String opcao="X";
        BemVinda.darBemVinda();//metodo de clase abtracta
       // Tabuleiro meuTabuleiro = new Tabuleiro();
        System.out.println("Qual é seu nome?:");
        String nomeDoJogador = input.next();
        Jogador jogador = new Jogador(nomeDoJogador);
        while (!(opcao.equals("1") || opcao.equals("2"))) {

            System.out.println("Quer posicionar seus navios:");
            System.out.println("Opção 1-Aleatorio");
            System.out.println("Opção 2-Manual");
            opcao = input.next();
//Temos que faze a logica de que acontece
        };
        jogador.tabuleiro.gerarTabuleiroVazio();
        jogador.tabuleiro.exibirTabuleiro(jogador.getNome());
        // é uma prova
        jogador.atirar((char) 1, (char) 3);
        jogador.atirar((char) 0, (char) 9);
        jogador.atirar((char) 0, (char) 0);
        //meuTabuleiro.
    }
}
