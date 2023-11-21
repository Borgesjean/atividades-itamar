package Atividade3Pontos;
import java.util.Scanner;

public class questao39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String numeroOctal = converterParaOctal(numeroDecimal);

        System.out.println("O número octal correspondente é: " + numeroOctal);


        scanner.close();
    }

    private static String converterParaOctal(int numeroDecimal) {

        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 8;
            octal.insert(0, resto);
            numeroDecimal /= 8;
        }

        return octal.toString();
    }
}
