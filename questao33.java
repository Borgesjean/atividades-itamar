package Atividade3Pontos;
import java.util.Scanner;

public class questao33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da compra: R$");
        double valorCompra = scanner.nextDouble();

        System.out.print("Informe o valor pago pelo cliente: R$");
        double valorPago = scanner.nextDouble();

        double troco = calcularTroco(valorCompra, valorPago);

        if (troco >= 0) {
            System.out.println("Troco: R$" + troco);
        } else {
            System.out.println("O valor pago é insuficiente. Faltam R$" + (-troco) + " para completar a compra.");
        }

        scanner.close();
    }

    private static double calcularTroco(double valorCompra, double valorPago) {
        return valorPago - valorCompra;
    }
}
