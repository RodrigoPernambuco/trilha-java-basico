public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        // classe String sempre representa texto
        
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com 0 o tipo não vai ser reconhecido - sujeito a alteração da tipagem
        long cpf = 98765432109L; // Se começar com 0 o tipo não vai ser reconhecido - sujeito a alteração da tipagem - o valor da variavel tem que terminal com "l" ou "L"
        float pi = 3.14F; // Igual ao long, o valor da variavel tem que terminar com "f" ou "F"
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14; //variavel nunca pode ser atribuida com novo valor e sempre tem que estar em CAIXA_ALTA com underline
    }
}
