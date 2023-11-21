package Atividade3Pontos;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[100];
        int quantidadeDeNumeros = 0;

        System.out.println("Digite os números (insira um número igual ao primeiro para parar):");
        double primeiroNumero = scanner.nextDouble();
        double numero;

        do {
            numero = scanner.nextDouble();

            numeros[quantidadeDeNumeros] = numero;
            quantidadeDeNumeros++;

        } while (numero != primeiroNumero);

        System.out.println("Números lidos:");

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
