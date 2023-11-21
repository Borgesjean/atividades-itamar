package Atividade3Pontos;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        System.out.println("Digite os números:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maiorNumero = numeros[0];
        int posicaoMaiorNumero = 0;

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaiorNumero = i;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A posição do maior número no array é: " + posicaoMaiorNumero);

        scanner.close();
    }
}
