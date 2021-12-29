package com.letscode.javabasico;

import java.util.Random;
import java.util.Scanner;

import static com.letscode.javabasico.Constantes.*;

public class TabuleiroHumano {
    public final char[][] tabuleiroHumano;/*Ou private*/
    public int navios;
    private String nome;

    Random aleatorio = new Random();

    public TabuleiroHumano(String nome) {
        this.tabuleiroHumano = new char[NAVIOS][NAVIOS];;
        this.nome = nome;
        this.navios= NAVIOS;
    }
    public String getNome() {
        return nome;
    }
    public void gerarTabuleiroVazio(){
        for (int i=0; i <NAVIOS;i++) {
            for (int j = 0; j < NAVIOS; j++) {
                tabuleiroHumano[i][j]=20;
            }

        }
    }

    public void gerarTabuleiroAleatorio(){
        gerarTabuleiroVazio();
        for (int i = 0; i < NAVIOS ; i++) {

            tabuleiroHumano[i][aleatorio.nextInt(10)]='N';
        }
    }
    public void gerarTabuleiroManual() {
        gerarTabuleiroVazio();
        Scanner input = new Scanner(System.in);
        int posicao =0;
        boolean exit;
        String validar;
        char letraDaLinha = 65;
        for (int i = 0; i < NAVIOS ; i++) {
            System.out.printf("EM qual posição da linha %c quer colocar o Navio(0-9): ", letraDaLinha);
            validar = input.next();
                if(!validar.matches("[0-9]*")) {
                	System.out.println("Por favor, insira um n�mero v�lido.");
                	validar = "";
                }else {
                	posicao = Integer.parseInt(validar);
                	do {

                        if (posicao < 0 || posicao > 9) {
                            System.out.println("posição não valida");
                            System.out.printf("EM qual posição da linha %c quer colocar o Navio(0-9): ", letraDaLinha);
                            posicao = input.nextInt();
                        }
                    }while (posicao < 0 || posicao > 9);
                    tabuleiroHumano[i][posicao] = 'N';
                    letraDaLinha++;
                }
        }
        input.close();
    }
    public void exibirTabuleiro(String nomeDoJogador){
        System.out.println("|----------------- " + nomeDoJogador + " ----------------|");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");
        char letraDaLinha = 65;
        String linhaDoTabuleiro = "";

        for (char[] linha: tabuleiroHumano) {
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
    public void verificarTiro(int fila, int coluna, TabuleiroComputador computador){//
        fila-=65;
        coluna -=48;
        if (computador.tabuleiroComputador[fila][coluna]==NAVIO){
            if (tabuleiroHumano[fila][coluna]==NAVIO){
                tabuleiroHumano[fila][coluna] = ACERTOU_TIRO_NAVIO_POSICIONADO;
            }else{
                 tabuleiroHumano[fila][coluna] = ACERTOU_TIRO;
            }
             computador.tabuleiroComputador[fila][coluna] = ACERTOU_TIRO;
             computador.restar();

        }else {
            if (tabuleiroHumano[fila][coluna]==NAVIO){
                tabuleiroHumano[fila][coluna]=ERROU_TIRO_NAVIO_POSICIONADO;
            }else{
            tabuleiroHumano[fila][coluna] = ERROU_TIRO;
            }
        }

    }
}
