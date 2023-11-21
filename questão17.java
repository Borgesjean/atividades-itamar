package Atividade3Pontos;
 import java.util.Scanner;

public class questão17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int quantidadeDeNumeros = 0;

        System.out.println("Digite os números (insira um número primo para parar):");
        int numero;

        do {
            numero = scanner.nextInt();

            if (numero > 1 && ehPrimo(numero)) {
                break;
            } else {
                System.out.println("O número não é primo. Tente novamente.");
            }

            numeros[quantidadeDeNumeros] = numero;
            quantidadeDeNumeros++;

        } while (true);

        System.out.println("Números lidos:");

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
