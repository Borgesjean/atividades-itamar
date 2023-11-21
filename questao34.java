package Atividade3Pontos;
import java.util.Scanner;

public class questao34 {
    public static void main(String[] args) {
        double baseCalculo = 1372.22;

        double icmsTaxa = 17.5 / 100;
        double ipiTaxa = 7 / 100;
        double pisTaxa = 3.75 / 100;
        double cofinsTaxa = 4 / 100;


        double icms = calcularImposto(baseCalculo, icmsTaxa);
        double ipi = calcularImposto(baseCalculo, ipiTaxa);
        double pis = calcularImposto(baseCalculo, pisTaxa);
        double cofins = calcularImposto(baseCalculo, cofinsTaxa);

        double valorTotalNota = calcularValorTotalNota(baseCalculo, icms);

        System.out.println("Valor total da nota fiscal: R$" + valorTotalNota);
        System.out.println("ICMS: R$" + icms);
        System.out.println("IPI: R$" + ipi);
        System.out.println("PIS: R$" + pis);
        System.out.println("COFINS: R$" + cofins);
    }

    private static double calcularImposto(double baseCalculo, double taxa) {
        return baseCalculo * taxa;
    }

    private static double calcularValorTotalNota(double baseCalculo, double icms) {
        return baseCalculo + icms;
    }
}
