package Atividade3Pontos;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] numeros = new double[tamanho];

        System.out.println("Digite os números:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / tamanho;

        int quantidadeAcimaDaMedia = 0;
        for (double numero : numeros) {
            if (numero > media) {
                quantidadeAcimaDaMedia++;
            }
        }

        System.out.println("A média dos números é: " + media);
        System.out.println("Quantidade de números acima da média: " + quantidadeAcimaDaMedia);

        scanner.close();
    }
}
