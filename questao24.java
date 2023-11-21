package Atividade3Pontos;
import java.util.Scanner;
public class questao24 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[100];
    int quantidadeDeNumeros = 0;
    int somaDosNumeros = 0;
    int quantidadeDePares = 0;

        System.out.println("Digite os números (insira um número negativo para parar):");
    int numero;

        do {
        numero = scanner.nextInt();

        if (numero < 0) {
            break;
        }

        numeros[quantidadeDeNumeros] = numero;
        somaDosNumeros += numero;
        quantidadeDeNumeros++;

        if (numero % 2 == 0) {
            quantidadeDePares++;
        }

    } while (true);

    double media = quantidadeDeNumeros > 0 ? (double) somaDosNumeros / quantidadeDeNumeros : 0;

        System.out.println("A média dos números lidos é: " + media);
        System.out.println("Quantidade de números pares: " + quantidadeDePares);

        scanner.close();
}
}


