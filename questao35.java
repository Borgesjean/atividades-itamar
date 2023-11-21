package Atividade3Pontos;
import java.util.Scanner;

public class questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número binário: ");
        String binario1 = scanner.next();

        System.out.print("Digite o segundo número binário: ");
        String binario2 = scanner.next();

        String resultadoSoma = somarBinarios(binario1, binario2);

        System.out.println("Resultado da soma binária: " + resultadoSoma);

        scanner.close();
    }

    private static String somarBinarios(String binario1, String binario2) {
        int comprimentoMaximo = Math.max(binario1.length(), binario2.length());
        binario1 = completarZeros(binario1, comprimentoMaximo);
        binario2 = completarZeros(binario2, comprimentoMaximo);

        StringBuilder resultado = new StringBuilder();
        int carry = 0; // Representa o "vai um"

        for (int i = comprimentoMaximo - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(binario1.charAt(i));
            int bit2 = Character.getNumericValue(binario2.charAt(i));

            int somaBits = bit1 + bit2 + carry;

            resultado.insert(0, somaBits % 2);

            carry = somaBits / 2;
        }

        if (carry != 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }

    private static String completarZeros(String binario, int comprimentoMaximo) {
        StringBuilder binarioCompleto = new StringBuilder(binario);
        while (binarioCompleto.length() < comprimentoMaximo) {
            binarioCompleto.insert(0, '0');
        }
        return binarioCompleto.toString();
    }
}
