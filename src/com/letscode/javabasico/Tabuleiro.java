package com.letscode.javabasico;

import java.util.Random;
import java.util.Scanner;

import static com.letscode.javabasico.Constantes.*;

public class Tabuleiro {
    public final char[][] tabuleiro;
    public int navios;
    private String nome;

    Random aleatorio = new Random();

    public Tabuleiro() {
        this.tabuleiro = new char[NAVIOS][NAVIOS];
        this.navios = NAVIOS;
        this.nome = nome;
    }

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

    public void gerarTabuleiroManual() {
        gerarTabuleiroVazio();
        Scanner input = new Scanner(System.in);
        int posicao =0;
        boolean exit;
        String validar;
        char letraDaLinha = 65;
        for (int i = 0; i < NAVIOS ; i++) {
            System.out.printf("Em qual posição da linha %c quer colocar o Navio(0-9): ", letraDaLinha);
            validar = input.next();
            System.out.print(validar);
            if(!validar.matches("[0-9]*")) {
                System.out.print("-----Por favor, insira um número válido.-----");
                validar = "";
            }else {
                posicao = Integer.parseInt(validar);
                tabuleiro[i][posicao]='N';
                letraDaLinha++;
            }

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
        // System.out.println(getNavios());
    }

    public void verificarTiro(TabuleiroHumano humano){
        int fila = aleatorio.nextInt(10);
        int coluna = aleatorio.nextInt(10);
        if (humano.tabuleiroHumano[fila][coluna]==NAVIO || humano.tabuleiroHumano[fila][coluna]==ERROU_TIRO_NAVIO_POSICIONADO){
            humano.restar();
        }
    }

}