package com.ebac.exercicio.modulo15;

import java.util.Scanner;

public class Escada {

    public Escada() { // construtor de Escada que recebe o valor de n e chama o metodo recursivo subir(int n)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        System.out.println(subir(n));
    }

    public static int subir(int n) {
        if (n == 1) // caso base: caso seja 1 degrau so tem uma forma de subir (1)
            return 1;
        if (n <= 2) // caso base: caso seja 2 degraus tem duas formas de subir (1 + 1 ou 2)
            return 2;

        // o primeiro caso ali cobre caso o primeiro passo seja de 1 degrau que daria: n - 1.
        // o segundo caso ali cobre caso o primeiro passo seja de 2 degraus que daria: n - 2
        // ai como eles cobrem todas as condições é so somar os 2 que vou ter quantos resultados possiveis da pra ter
        return (subir(n - 1)) + (subir(n - 2));
    }


}




