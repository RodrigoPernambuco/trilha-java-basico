package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int soma = 0;
        int contador = 0;

        do {
        System.out.println("Numero: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if(numero > maiorNumero){
            maiorNumero = numero;
        }
        contador++;
        } while(contador < 5);

        System.out.println("Maior: " + maiorNumero);
        System.out.println("A média é: " + (soma / 5));
    }
}
