package com.letscode.javabasico;

public abstract class Ganhador {
    public static String verificarGanhador(TabuleiroHumano humano, TabuleiroComputador computador){
       if (humano.getNavios() > computador.getNavios())
           return humano.getNome();
       return computador.getNome();

    }
}
