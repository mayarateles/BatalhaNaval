package com.letscode.javabasico;

public class Tabuleiro {
    static char tabuleiro[][] = new char[10][10];
    String nomeDoJogador = "Moises";//por enquanto
    static final int VAZIO = 0;
    static final int NAVIO = 1;
    static final int ERROU_TIRO = 2;
    static final int ACERTOU_TIRO = 3;
    public static void exibirTabuleiro(String nomeDoJogador, char[][] tabuleiro){
        System.out.println("|----- " + nomeDoJogador + " -----|");

    }
    public static void main(String[] args) {

    }
}
