package Atividade3Pontos;
import java.util.Scanner;

public class questao20 {
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

        int menorNumero = numeros[0];
        int posicaoMenorNumero = 0;

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
                posicaoMenorNumero = i;
            }
        }

        System.out.println("O menor número é: " + menorNumero);
        System.out.println("A posição do menor número no array é: " + posicaoMenorNumero);

        scanner.close();
    }
}
