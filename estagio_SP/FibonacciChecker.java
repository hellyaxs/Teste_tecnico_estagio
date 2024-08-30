package estagio_SP;

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int fibAnterior = 0;
        int fibAtual = 1;

        while (fibAtual <= numero) {
            if (fibAtual == numero) {
                return true;
            }

            int fibProximo = fibAnterior + fibAtual;
            fibAnterior = fibAtual;
            fibAtual = fibProximo;
        }

        return false;
    }
}

