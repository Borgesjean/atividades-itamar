package Atividade3Pontos;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorNumero = Integer.MAX_VALUE;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("O menor número é: " + menorNumero);

        scanner.close();
    }
}
