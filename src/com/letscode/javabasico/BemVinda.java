package com.letscode.javabasico;
import static com.letscode.javabasico.Constantes.*;
public  abstract class BemVinda {

    public static void darBemVinda(){
        System.out.println(blue);
        System.out.println("______       ____   ________    ____      ___    ____     ___     ____");
        System.out.println("|     )     / /\\ \\  |__   __|  / /\\ \\    |   |   |   |   |   |   / /\\ \\ ");
        System.out.println("----         ---       |  |      --      |   |   |   |===|   |    ---");
        System.out.println("|_____)   /_/    \\_\\   |__|  /_/    \\_\\  |___|   |___|   |___| /_/    \\_\\ ");
        System.out.println();
        System.out.println("____     ____    ____   ___     ___   ____      ___");
        System.out.println("|   \\\\  |   |   / /\\ \\   \\ \\    / /  / /\\ \\    |   |");
        System.out.println("|   |\\\\ |   |    ---      \\ \\  / /     ---     |   |");
        System.out.println("|___| \\\\ ___| /_/    \\_\\   \\_\\/_/  / /    \\ \\  |___|");
        System.out.println(resetColor);
    }
}
