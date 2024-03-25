package ExerciciosEstagio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public static ArrayList<Integer> SequenciaFibonacci(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        while (fibonacci.get(fibonacci.size() - 1) < n) {
            int nextFibonacci = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(nextFibonacci);
        }
        return fibonacci;
    }

    public static boolean verificaNumero(int numero, ArrayList<Integer> sequencia) {
        return sequencia.contains(numero);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        ArrayList<Integer> sequenciaFibonacci = SequenciaFibonacci(numero);
        boolean pertence = verificaNumero(numero, sequenciaFibonacci);

        System.out.println("Sequência de Fibonacci até " + numero + ":");
        for (int i = 0; i < sequenciaFibonacci.size(); i++) {
            System.out.print(sequenciaFibonacci.get(i));
            if (i < sequenciaFibonacci.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
