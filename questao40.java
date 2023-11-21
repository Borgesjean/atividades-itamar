package Atividade3Pontos;
import java.util.Scanner;

public class questao40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String numeroBinario = scanner.next();

        int numeroDecimal = converterParaDecimal(numeroBinario);

        System.out.println("O número decimal correspondente é: " + numeroDecimal);

        scanner.close();
    }

    private static int converterParaDecimal(String numeroBinario) {
        int numeroDecimal = 0;
        int expoente = 0;

        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            char digito = numeroBinario.charAt(i);

            int valorDigito = Character.getNumericValue(digito);

            numeroDecimal += valorDigito * Math.pow(2, expoente);

            expoente++;
        }

        return numeroDecimal;
    }
}
