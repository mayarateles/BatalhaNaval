package com.letscode.javabasico;

import java.util.Random;

import static com.letscode.javabasico.Constantes.*;

public abstract class Tabuleiro {
    public char[][] tabuleiro;
    public int navios = NAVIOS;
    public String nome;

    Random aleatorio = new Random();

    public String getNome() {
        return nome;
    }

    public void gerarTabuleiroVazio(){
        for (int i=0; i <NAVIOS;i++) {
            for (int j = 0; j < NAVIOS; j++) {
                tabuleiro[i][j]=20;
            }
        }
    }

    public void gerarTabuleiroAleatorio(){
        gerarTabuleiroVazio();
        for (int i = 0; i < NAVIOS ; i++) {
            tabuleiro[i][aleatorio.nextInt(10)]='N';
        }
    }

    public void exibirTabuleiro(String nomeDoJogador){
        System.out.println("|---------------- " + nomeDoJogador + " ----------------|");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");
        char letraDaLinha = 65;
        String linhaDoTabuleiro = "";

        for (char[] linha: tabuleiro) {
            linhaDoTabuleiro = "| "+(letraDaLinha++) + " | ";

            for (char coluna : linha) {
                switch(coluna) {
                    case VAZIO :
                        linhaDoTabuleiro += "   |";
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
                    case ACERTOU_TIRO_NAVIO_POSICIONADO:
                        linhaDoTabuleiro += " X |";
                        break;
                    case ERROU_TIRO_NAVIO_POSICIONADO:
                        linhaDoTabuleiro += " n |";
                        break;
                }
            }
            System.out.println(linhaDoTabuleiro);
            System.out.println("---------------------------------------------");

        }
    }

    public int getNavios() {
        return navios;
    }

    public void restar(){
        navios--;
    }

}