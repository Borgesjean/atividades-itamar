package Atividade3Pontos;
import java.util.Scanner;

public class questao29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a porcentagem do IPI a ser acrescido: ");
        double percentualIPI = scanner.nextDouble();

        System.out.println("\nDados da Peça 1:");
        int codigoPeca1 = lerCodigo(scanner);
        double valorUnitarioPeca1 = lerValorUnitario(scanner);
        int quantidadePeca1 = lerQuantidade(scanner);

        System.out.println("\nDados da Peça 2:");
        int codigoPeca2 = lerCodigo(scanner);
        double valorUnitarioPeca2 = lerValorUnitario(scanner);
        int quantidadePeca2 = lerQuantidade(scanner);

        double valorTotal = calcularValorTotal(valorUnitarioPeca1, quantidadePeca1, valorUnitarioPeca2, quantidadePeca2, percentualIPI);

        System.out.println("\nValor total a ser pago: " + valorTotal);

        scanner.close();
    }

    private static int lerCodigo(Scanner scanner) {
        System.out.print("Código da peça: ");
        return scanner.nextInt();
    }

    private static double lerValorUnitario(Scanner scanner) {
        System.out.print("Valor unitário da peça: ");
        return scanner.nextDouble();
    }

    private static int lerQuantidade(Scanner scanner) {
        System.out.print("Quantidade de peças: ");
        return scanner.nextInt();
    }

    private static double calcularValorTotal(double valorUnitarioPeca1, int quantidadePeca1, double valorUnitarioPeca2, int quantidadePeca2, double percentualIPI) {
        double valorTotal = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (percentualIPI / 100 + 1);
        return valorTotal;
    }
}
