package com.letscode.javabasico;

import java.util.Random;
import java.util.Scanner;

public class Combate {

    Jogador humano = new Jogador();
    Jogador computador = new Jogador();

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    public void iniciarCombate() {
        obterNomeDosJogadores();
        posicionarNavios();

//        jogador.tabuleiro.gerarTabuleiroVazio();
//        jogador.tabuleiro.exibirTabuleiro(jogador.getNome());
//        // é uma prova
//        jogador.atirar((char) 1, (char) 3);
//        jogador.atirar((char) 0, (char) 9);
//        jogador.atirar((char) 0, (char) 0);
//        //meuTabuleiro.

        //Enquando não houver ganhador, o jogo avança
    }

    public void obterNomeDosJogadores() {
        System.out.println("Qual é o seu nome? ");
        humano.setNomeDoJogador(input.next());
        computador.setNomeDoJogador("computador");
    }

    public void posicionarNavios() {
        System.out.println("Como deseja posicionar seus navios? ");
        System.out.println("Opção 1 - Aleatório");
        System.out.println("Opção 2 - Manual");
        char opcao = input.next().charAt(0);

        if (opcao == 1) {
            posicionarNaviosAleatoriamente();
        } else if (opcao == 2) {
            posicionarNaviosComJogador();
        } else {
            System.out.println("Escolha apenas uma das opções disponíveis.");
        }

    }

    public void posicionarNaviosAleatoriamente(){
        int quantidadeDeNavios = 10;
        int linha, coluna;


        do {

        } while (quantidadeDeNavios > 0);

    }

    public void posicionarNaviosComJogador() {

    }

}
