package Atividade3Pontos;
import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número #" + i + ": ");

            double numero = scanner.nextDouble();

            soma += numero;
        }

        double media = soma / 10;

        System.out.println("A média dos 10 números é: " + media);

        scanner.close();
}
    }
