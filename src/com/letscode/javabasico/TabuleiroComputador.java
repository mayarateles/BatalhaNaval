package com.letscode.javabasico;

import java.util.Random;
import java.util.Scanner;

import static com.letscode.javabasico.Constantes.*;

public class TabuleiroComputador {
    public final char[][] tabuleiroComputador;/*Ou private*/
    public int navios;
    private String nome;

    Random aleatorio = new Random();

    public TabuleiroComputador() {
        this.nome = "Computador";
        this.tabuleiroComputador = new char[NAVIOS][NAVIOS];
        this.navios= NAVIOS;

    }

    public String getNome() {
        return nome;
    }
    public void gerarTabuleiroVazio(){
        for (int i=0; i <NAVIOS;i++) {
            for (int j = 0; j < NAVIOS; j++) {
                tabuleiroComputador[i][j]=20;
            }

        }
    }
    public void gerarTabuleiroAleatorio(){
        gerarTabuleiroVazio();
        for (int i = 0; i < NAVIOS ; i++) {

            tabuleiroComputador[i][aleatorio.nextInt(10)]='N';
        }
    }
    public void gerarTabuleiroManual() {
        gerarTabuleiroVazio();
        Scanner input = new Scanner(System.in);
        int posicao =0;
        boolean exit;
        char letraDaLinha = 65;
        for (int i = 0; i < NAVIOS ; i++) {//ainda pode dar error con string
            System.out.printf("EM qual posição da linha %c quer colocar o Navio(0-9): ", letraDaLinha);
            posicao = input.nextInt();
            tabuleiroComputador[i][posicao]='N';
            letraDaLinha++;
        }
        input.close();
    }
    public void exibirTabuleiro(String nomeDoJogador){
        System.out.println("|---------------- " + nomeDoJogador + " ----------------|");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");
        char letraDaLinha = 65;
        String linhaDoTabuleiro = "";

        for (char[] linha: tabuleiroComputador) {
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
   // System.out.println(getNavios());
}

    public void verificarTiro(TabuleiroHumano humano){
        int fila = aleatorio.nextInt(10);
        int coluna = aleatorio.nextInt(10);
        if (humano.tabuleiroHumano[fila][coluna]==NAVIO ||
                humano.tabuleiroHumano[fila][coluna]==ERROU_TIRO_NAVIO_POSICIONADO){

             humano.restar();

        }

    }
}
