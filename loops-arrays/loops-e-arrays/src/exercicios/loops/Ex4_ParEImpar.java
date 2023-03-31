package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int contador = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            contador++;

            if(numero % 2 == 0) quantidadePares++; 
            else quantidadeImpares++;

        } while(contador < quantidadeNumeros);
        System.out.println("Quantidade de Pares: " + quantidadePares);
        System.out.println("Quantidade de Impares: " + quantidadeImpares);
    }
    
}
