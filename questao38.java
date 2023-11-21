package Atividade3Pontos;
import java.util.Scanner;

public class questao38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String numeroHexadecimal = converterParaHexadecimal(numeroDecimal);

        System.out.println("O número hexadecimal correspondente é: " + numeroHexadecimal);

        scanner.close();
    }

    private static String converterParaHexadecimal(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 16;
            char digitoHexadecimal = (resto < 10) ? (char) ('0' + resto) : (char) ('A' + resto - 10);
            hexadecimal.insert(0, digitoHexadecimal);
            numeroDecimal /= 16;
        }

        return hexadecimal.toString();
    }
}
