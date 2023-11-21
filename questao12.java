package Atividade3Pontos;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[100];
        int quantidadeDeNumeros = 0;

        System.out.println("Digite os números (insira um número negativo para parar):");
        double numero;
        double somaDosNumeros = 0;

        do {
            numero = scanner.nextDouble();

            if (numero >= 0) {
                numeros[quantidadeDeNumeros] = numero;
                somaDosNumeros += numero;
                quantidadeDeNumeros++;
            }

        } while (numero >= 0);

        double media = quantidadeDeNumeros > 0 ? somaDosNumeros / quantidadeDeNumeros : 0;

        System.out.println("A média dos números lidos é: " + media);

        scanner.close();
    }
}
