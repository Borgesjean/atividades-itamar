package Atividade3Pontos;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int quantidadeDeNumeros = 0;

        System.out.println("Digite os números (insira um número repetido para parar):");
        int numero;
        boolean repetido = false;

        do {
            numero = scanner.nextInt();

            for (int i = 0; i < quantidadeDeNumeros; i++) {
                if (numeros[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numeros[quantidadeDeNumeros] = numero;
                quantidadeDeNumeros++;
            }

        } while (!repetido);

        System.out.println("Quantidade de números lidos antes da repetição: " + quantidadeDeNumeros);

        scanner.close();
    }
}
