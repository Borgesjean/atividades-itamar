package Atividade3Pontos;
import java.util.Scanner;

public class questão18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int quantidadeDeNumeros = 0;

        System.out.println("Digite os números (insira a soma dos dois anteriores para parar):");

        numeros[quantidadeDeNumeros++] = scanner.nextInt();
        numeros[quantidadeDeNumeros++] = scanner.nextInt();

        int numeroAtual;

        do {
            numeroAtual = scanner.nextInt();

            if (numeroAtual == numeros[quantidadeDeNumeros - 1] + numeros[quantidadeDeNumeros - 2]) {
                break;
            } else {

                numeros[quantidadeDeNumeros++] = numeroAtual;
            }

        } while (true);

        System.out.println("Números lidos:");

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
