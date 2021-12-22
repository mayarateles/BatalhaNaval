package com.letscode.javabasico;

public class Jogador {

    private String nome;
    public  Tabuleiro tabuleiro;
    public Jogador(String nome) {
        this.nome = nome;
        tabuleiro = new Tabuleiro();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void atirar(char fila, char coluna){
        tabuleiro.tabuleiro[fila][coluna] =42;
        tabuleiro.exibirTabuleiro(getNome());
    }
}
