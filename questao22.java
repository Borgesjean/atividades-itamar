package Atividade3Pontos;
import java.util.Scanner;

public class questao22 {
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

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior && numero < maior) {
                segundoMaior = numero;
            }
        }

        if (segundoMaior == Integer.MIN_VALUE) {
            System.out.println("Não há segundo maior número no array.");
        } else {
            System.out.println("O segundo maior número é: " + segundoMaior);
        }

        scanner.close();
    }
}
