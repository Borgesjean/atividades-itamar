package Atividade3Pontos;
import java.util.Scanner;

public class questao37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String numeroBinario = converterParaBinario(numeroDecimal);

        System.out.println("O número binário correspondente é: " + numeroBinario);

        scanner.close();
    }

    private static String converterParaBinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            binario.insert(0, resto);
            numeroDecimal /= 2;
        }

        return binario.toString();
    }
}
