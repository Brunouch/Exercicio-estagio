package ExerciciosEstagio;

import java.util.Scanner;

public class Exercicio5 {
    
    public static String inverterString(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para inverter:");
        String texto = scanner.nextLine();

        String resultado = inverterString(texto);
        System.out.println("String invertida: " + resultado);
        
    }
}
