package com.letscode.javabasico;

import java.util.Arrays;

public class Tabuleiro {
    //static String nomeDoJogador = "Moises";//por enquanto
    public static char[][] tabuleiro= new char[10][10];;

    static final char VAZIO = 20;
    static final char NAVIO =78;//ascii
    static final char ERROU_TIRO = 45;//ascii
    static final char ACERTOU_TIRO = 42;//ascii
    public Tabuleiro() {



    }
    public void gerarTabuleiroVazio(){
        for (int i=0; i <10;i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro[i][j]=20;
            }

        }
    }

    public static void exibirTabuleiro(String nomeDoJogador){
        System.out.println("|------------------ " + nomeDoJogador + " -----------------|");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");
        char letraDaLinha = 65;
        String linhaDoTabuleiro = "";

        for (char[] linha: tabuleiro) {
            linhaDoTabuleiro = "| "+(letraDaLinha++) + " | ";

            for (char coluna : linha) {
                switch(coluna) {
                    case VAZIO :
                        linhaDoTabuleiro += "  | ";
                        break;
                    case NAVIO :
                        linhaDoTabuleiro += " N |";
                        break;

                    case ERROU_TIRO :
                        linhaDoTabuleiro += " - |";
                        break;

                    case ACERTOU_TIRO :
                        linhaDoTabuleiro += " * |";
                        break;
                }
            }
            System.out.println(linhaDoTabuleiro);
            System.out.println("---------------------------------------------");

        }


    }

    @Override
    public String toString() {
        return "Tabuleiro{" +
                "tabuleiro=" + Arrays.toString(tabuleiro) +
                '}';
    }
}
