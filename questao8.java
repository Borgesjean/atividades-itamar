package Atividade3Pontos;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        imprimirDivisores(numero);
    }

    static void imprimirDivisores(int num) {
        System.out.print("Os divisores de " + num + " são: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
