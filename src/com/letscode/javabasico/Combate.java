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
        verificarTiro();

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

    public static char[][] posicionarNaviosAleatoriamente() {
        char novoTabuleiro[][] = Tabuleiro.gerarTabuleiroVazio();
        int quantidadeDeNavios = 10;
        int linha = 0;
        int coluna= 0;
        Random numeroAleatorio = new Random();
        for (int navio = 0; navio <10; navio++){
            linha = numeroAleatorio.nextInt(10-1+1)+1;
            coluna = numeroAleatorio.nextInt(10-1+1)+1;;
            novoTabuleiro[linha][coluna] = 'N';
        }
        return novoTabuleiro;
    }

    public void posicionarNaviosComJogador() {
        boolean inputLinha = false;
        boolean inputColuna = false;
        char linhaDoTabuleiro = 'k';
        char colunaDoTabuleiro = 'k';
        for (int navio = 0; navio <10; navio++){
            while (linhaDoTabuleiro >= 'A' || linhaDoTabuleiro <= 'J'){
                if (inputLinha) {
                    System.out.println("Informe a linha desejada entre as letras A e J.");
                }
                System.out.println("Informe a linha para atirar: A-J");
                linhaDoTabuleiro = input.next().charAt(0);
                inputLinha = true;
            }
            while (colunaDoTabuleiro >= '0' || colunaDoTabuleiro <= '9'){
                if (inputColuna) {
                    System.out.println("Informe a coluna desejada entre os números 0 e 9.");
                }
                System.out.println("Informe a coluna para atirar: 0-9");
                colunaDoTabuleiro = input.next().charAt(0);
                inputColuna = true;
            }
        }
    }

    private void verificarTiro() {
    }

}
