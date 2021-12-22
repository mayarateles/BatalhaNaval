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

}
