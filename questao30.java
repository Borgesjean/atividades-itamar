package Atividade3Pontos;
import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Informe o salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");

        scanner.close();
    }
}
