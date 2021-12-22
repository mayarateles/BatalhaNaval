package com.letscode.javabasico;

import java.util.Random;
import java.util.Scanner;

public class Jogador {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    private String nomeDoJogador;
    private Tabuleiro tabuleiro;

    public Jogador() {
        this.nomeDoJogador = getNomeDoJogador();
        tabuleiro = new Tabuleiro();
    }

    public String getNomeDoJogador() {

        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {

        this.nomeDoJogador = nomeDoJogador;
    }

    public void atirar(char linha, char coluna){
        System.out.println("Informe a linha que deseja atirar: ");
        linha = input.next().charAt(0);
        System.out.println("Informe a coluna que deseja atirar: ");
        coluna = input.next().charAt(0);

        tabuleiro.tabuleiro[linha][coluna] =45;
        tabuleiro.exibirTabuleiro(getNomeDoJogador());
    }

    public void solicitarCoordenadas(Jogador jogador) {
        boolean inputLinha = false;
        boolean inputColuna = false;
        char linhaDoTabuleiro = 'k';
        char colunaDoTabuleiro = 'k';
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
