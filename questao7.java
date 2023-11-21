package Atividade3Pontos;
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] numeros = new double[tamanho];

        System.out.println("Digite os números do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos números no array é: " + soma);

        scanner.close();
    }
}
