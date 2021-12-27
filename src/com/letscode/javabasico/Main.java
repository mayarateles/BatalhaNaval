package com.letscode.javabasico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("______       ____   ________    ____      ___    ____     ___     ____");
        System.out.println("|     )     / /\\ \\  |__   __|  / /\\ \\    |   |   |   |   |   |   / /\\ \\ ");
        System.out.println("----         ---       |  |      --      |   |   |   |===|   |    ---");
        System.out.println("|_____)   /_/    \\_\\   |__|  /_/    \\_\\  |___|   |___|   |___| /_/    \\_\\ ");
        System.out.println();
        System.out.println("____     ____    ____   ___     ___   ____      ___");
        System.out.println("|   \\\\  |   |   / /\\ \\   \\ \\    / /  / /\\ \\    |   |");
        System.out.println("|   |\\\\ |   |    ---      \\ \\  / /     ---     |   |");
        System.out.println("|___| \\\\ ___| /_/    \\_\\   \\_\\/_/  / /    \\ \\  |___|");
        System.out.println();

        System.out.println("      1  -  COMEÇAR        2  -  SAIR");
        int opcao = input.nextInt();

        if (opcao == 1) {
            Combate combate = new Combate();

            combate.iniciarCombate();


        } else if (opcao == 2) {
            System.out.println("Espero revê-lo em breve.");
        } else {
            System.out.println("Você deve digitar uma das opções disponíveis!");
        }

        input.close();
    }
}
