package exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa{
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int contador = 0;

        while(contador < (vetor.length - 1)){
            System.out.print(vetor[contador]);
            contador++;
        }

        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i]);
        }
    }
}