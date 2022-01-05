package com.letscode.javabasico;
import static com.letscode.javabasico.Constantes.*;
public  abstract class BemVinda {

    public static void darBemVinda(){
        System.out.println(blue);
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░▒▒▒░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓▒▓░░▓▒▒▒░▓▒▒▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░▒░░▓░▒▒░▓░░▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▓▒▒▓▒▒▓▒▓▒▒▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓░▒▓░▒▒░▓░░▓░░▓░▒▓░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▓▓░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░▓██████▓▓▒░░░░░░███▓░░░░▓█████████▒░░░░███▓░░░░░▓██▒░░░░░░▓██▒░░░░███░░░░░░███▓░░░░░░░░\n" +
                "░░░▓███░░░███▓░░░░█████▓░░░▒▓▓▓███▓▓▓▒░░░█████▓░░░░▓██▒░░░░░░███▓░░░░███░░░░░█████▓░░░░░░░\n" +
                "░░░▓███▓▓▓███▒░░░███░░███░░░░░░███░░░░░░███░░███░░░▓██▒░░░░░░████▓▓▓▓███░░░░███░░███░░░░░░\n" +
                "░░░▓███▓▓▓███▓░░▓███▒▒███▒░░░░░███░░░░░▓███▒▒███▒░░▓██▒░░░░░░███████████░░░▓███▒▒███▒░░░░░\n" +
                "░░░▓██▓░░░▒███░▒██████████▒░░░░███░░░░▒██████████▒░▓██▓▒▒▒▒▒░███▓░░░░███░░▒██████████▒░░░░\n" +
                "░░░▓█████████▒░███▒░░░░░███▓░░░███░░░▓██▓░░░░░▒███░▓████████░███▓░░░░███░▒███░░░░░▒███▒░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░████░░░░███░░░░░▓████░░░░███▒░░░░▒███░░░▒████░░░░░▒███░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░█████▓░░███░░░░▒██████░░░▒███░░░▒███░░░░██████░░░░▒███░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░███████▒███░░░▒███░░███░░░▒███░░███░░░░███░░███░░░▒███░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░███▒▒██████░░░████▓▓███▓░░░▓██████▒░░░████▓▓████░░▒███░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░███▒░░▓████░░███▓▒▒▒▒███▒░░░▓████▒░░░▓██▓▒▒▒▒▓███░▒███▓▓▓▓▓▒░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░▓▓▓░░░░░▓▓▓░▓▓▓▒░░░░░░▓▓▓░░░░▓▓▓▒░░░▒▓▓▓░░░░░░▓▓▓▒░▓▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println(resetColor);
    }
}
