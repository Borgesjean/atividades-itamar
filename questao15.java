package Atividade3Pontos;
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[100];
        int quantidadeDeNumeros = 0;

        System.out.println("Digite os números (insira um número maior que o anterior para parar):");
        double numero;
        boolean sequenciaCrescente = true;

        do {
            numero = scanner.nextDouble();

            if (quantidadeDeNumeros > 0 && numero <= numeros[quantidadeDeNumeros - 1]) {
                sequenciaCrescente = false;
                break;
            }

            numeros[quantidadeDeNumeros] = numero;
            quantidadeDeNumeros++;

        } while (sequenciaCrescente);

        System.out.println("Números lidos:");

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
