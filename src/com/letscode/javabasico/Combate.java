package com.letscode.javabasico;

import java.util.Scanner;

public class Combate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao = "X";
        char tiroFila;//65-74 ou 97-106
        char tiroColuna;//0-9
        BemVinda.darBemVinda();//metodo de clase abtracta
        System.out.println("      1  -  COMEÇAR        Qualquer tecla  -  SAIR");
        opcao = input.next();
        if (opcao.equals("1")) {
            System.out.println("Qual é seu nome?:");
            String nomeDoJogador = input.next();
            TabuleiroComputador computador = new TabuleiroComputador();
            TabuleiroHumano humano = new TabuleiroHumano(nomeDoJogador);

            opcao = "X";//para que entre no while
            while (!(opcao.equals("1") || opcao.equals("2"))) {

                System.out.println("Quer posicionar seus navios:");
                System.out.println("Opção 1-Aleatorio");
                System.out.println("Opção 2-Manual");
                opcao = input.next();
//
            }
            ;


            computador.gerarTabuleiroAleatorio();
           // computador.exibirTabuleiro(computador.getNome());
            if (opcao.equals("1")){
                humano.gerarTabuleiroAleatorio();
            }else{
                humano.gerarTabuleiroManual();
            }
            // começo do jogo
            computador.exibirTabuleiro(computador.getNome());/**/
            humano.exibirTabuleiro(humano.getNome());
            do {
                do {//obter e validar tiro fila
                    System.out.println("Em que fila deseja Atirar?(só valores entre A-J):");
                    tiroFila = input.next().charAt(0);

                    //mensagem para quando no seja valido
                }while (!(tiroFila >= 65 && tiroFila <= 74) && !(tiroFila <= 106 && tiroFila >= 97));

                do {//obter e validar tiro fila
                    System.out.println("Em que coluna deseja Atirar?(só valores entre 0-9):");
                    tiroColuna = input.next().charAt(0);
                    //mensagem para quando no seja valido
                }while (tiroColuna < 0 || tiroColuna>74);

            humano.verificarTiro(tiroFila, tiroColuna,computador);//computador
            computador.verificarTiro(humano);
            humano.exibirTabuleiro(humano.getNome());
            //computador.exibirTabuleiro(computador.getNome());
                System.out.printf("%s tem %d,  %s tem %d %n", humano.getNome(), humano.getNavios(), computador.getNome(),
                        computador.getNavios());
            }while (humano.getNavios()>0 && computador.getNavios()>0);
//exibir os dois tabuleiros
            humano.exibirTabuleiro(humano.getNome());
            computador.exibirTabuleiro(computador.getNome());
            String ganhador= Ganhador.verificarGanhador(humano, computador);
            System.out.printf("O Ganhador é %s ficou con %d navio(s)", ganhador, ganhador.equals(humano.getNome())?
                    humano.getNavios():computador.getNavios());
        }
    }
}