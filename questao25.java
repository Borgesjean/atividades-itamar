package Atividade3Pontos;
import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[100];
        int quantidadeDeNumeros = 0;
        double somaDosNumeros = 0;

        System.out.println("Digite os números (insira a média até este ponto para parar):");

        do {
            double numero = scanner.nextDouble();

            double mediaAteAgora = quantidadeDeNumeros > 0 ? somaDosNumeros / quantidadeDeNumeros : 0;

            if (numero == mediaAteAgora) {
                break;
            }

            numeros[quantidadeDeNumeros] = numero;
            somaDosNumeros += numero;
            quantidadeDeNumeros++;

        } while (true);

        System.out.println("Números lidos:");

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
