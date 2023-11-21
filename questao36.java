package Atividade3Pontos;
import java.util.Scanner;

public class questao36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número binário: ");
        String binario1 = scanner.next();

        System.out.print("Digite o segundo número binário: ");
        String binario2 = scanner.next();

        String resultadoMultiplicacao = multiplicarBinarios(binario1, binario2);

        System.out.println("Resultado da multiplicação binária: " + resultadoMultiplicacao);

        scanner.close();
    }

    private static String multiplicarBinarios(String binario1, String binario2) {
        int numero1 = Integer.parseInt(binario1, 2);
        int numero2 = Integer.parseInt(binario2, 2);

        int resultadoDecimal = numero1 * numero2;

        return Integer.toBinaryString(resultadoDecimal);
    }
}
