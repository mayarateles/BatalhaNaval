package com.letscode.javabasico;

import static com.letscode.javabasico.Constantes.*;
import static com.letscode.javabasico.Constantes.ERROU_TIRO_NAVIO_POSICIONADO;

public class TabuleiroComputador extends Tabuleiro {

    public TabuleiroComputador() {
        super.tabuleiro = new char[NAVIOS][NAVIOS];
        super.navios = NAVIOS;
        super.nome = NOMEDOCOMPUTADOR;
    }

    public void verificarTiro(TabuleiroHumano humano){
        int fila = aleatorio.nextInt(10);
        int coluna = aleatorio.nextInt(10);
        if (humano.tabuleiro[fila][coluna]==NAVIO || humano.tabuleiro[fila][coluna]==ERROU_TIRO_NAVIO_POSICIONADO){
            humano.restar();
        }
    }
}