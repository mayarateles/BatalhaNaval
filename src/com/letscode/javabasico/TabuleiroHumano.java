package com.letscode.javabasico;

import java.util.Scanner;

import static com.letscode.javabasico.Constantes.*;

public class TabuleiroHumano extends Tabuleiro{

    public TabuleiroHumano(String nome) {
        super.tabuleiro = new char[NAVIOS][NAVIOS];
        super.navios = NAVIOS;
        super.nome = nome;
    }

    public void gerarTabuleiroManual() {
        gerarTabuleiroVazio();
        Scanner input = new Scanner(System.in);
        int posicao;
        String validar;
        char letraDaLinha = 65;
        for (int i = 0; i < NAVIOS ; i++) {
            System.out.printf("EM qual posição da linha %c quer colocar o Navio(0-9): ", letraDaLinha);
            validar = input.next();
            if(!validar.matches("[0-9]*")) {
                System.out.println("-----Por favor, insira um número válido.-----");
                validar = "";
            }else {
                posicao = Integer.parseInt(validar);
                do {

                    if (posicao < 0 || posicao > 9) {
                        System.out.println("posição nÃ£o valida");
                        System.out.printf("Em qual posição da linha %c quer colocar o Navio(0-9): ", letraDaLinha);
                        posicao = input.nextInt();
                    }
                }while (posicao < 0 || posicao > 9);
                tabuleiro[i][posicao] = 'N';
                letraDaLinha++;
            }
        }
    }


    public void verificarTiro(int fila, int coluna, TabuleiroComputador computador){//
        if(fila >= 65 && fila <= 74) {
            fila -= 65;
        }else {
            fila -= 97;
        }
        coluna -= 48;

        if (computador.tabuleiro[fila][coluna]==NAVIO){
            if (tabuleiro[fila][coluna]==NAVIO){
                tabuleiro[fila][coluna] = ACERTOU_TIRO_NAVIO_POSICIONADO;
            }else{
                tabuleiro[fila][coluna] = ACERTOU_TIRO;
            }
            computador.tabuleiro[fila][coluna] = ACERTOU_TIRO;
            computador.restar();

        }else {
            if (tabuleiro[fila][coluna]==NAVIO){
                tabuleiro[fila][coluna]=ERROU_TIRO_NAVIO_POSICIONADO;
            }else{
                tabuleiro[fila][coluna] = ERROU_TIRO;
            }
        }

    }

    public void exibirTabuleiro(String nomeDoJogador){
        System.out.println("|----------------- " + nomeDoJogador + " ----------------|");
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
                        linhaDoTabuleiro += green+" * "+resetColor+"|";
                        break;
                    case ACERTOU_TIRO_NAVIO_POSICIONADO:
                        linhaDoTabuleiro += green + " X "+resetColor+"|";
                        break;
                    case ERROU_TIRO_NAVIO_POSICIONADO:
                        linhaDoTabuleiro += red + " n "+resetColor+"|";
                        break;
                }
            }
            System.out.println(linhaDoTabuleiro);
            System.out.println("---------------------------------------------");

        }
    }
}