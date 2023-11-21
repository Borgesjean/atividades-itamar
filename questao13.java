package Atividade3Pontos;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosPares = new int[100];
        int[] numerosImpares = new int[100];
        int quantidadeDePares = 0;
        int quantidadeDeImpares = 0;

        System.out.println("Digite os números (insira 999 para parar):");
        int numero;
        do {
            numero = scanner.nextInt();

            if (numero != 999) {
                if (numero % 2 == 0) {
                    numerosPares[quantidadeDePares] = numero;
                    quantidadeDePares++;
                } else {
                    numerosImpares[quantidadeDeImpares] = numero;
                    quantidadeDeImpares++;
                }
            }

        } while (numero != 999);

        int somaPares = calcularSoma(numerosPares, quantidadeDePares);

        int somaImpares = calcularSoma(numerosImpares, quantidadeDeImpares);

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scanner.close();
    }

    private static int calcularSoma(int[] numeros, int quantidade) {
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
        }
        return soma;
    }
}
