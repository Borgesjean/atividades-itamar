package Atividade3Pontos;
import java.util.Scanner;

public class questao43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String abreviatura = obterAbreviatura(nomeCompleto);

        System.out.println("Abreviatura: " + abreviatura);

        scanner.close();
    }

    private static String obterAbreviatura(String nomeCompleto) {
        StringBuilder abreviatura = new StringBuilder();

        String[] palavras = nomeCompleto.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > 2) {
                abreviatura.append(palavras[i].charAt(0)).append(". ");
            } else {
                abreviatura.append(palavras[i]).append(" ");
            }
        }

        return abreviatura.toString().trim();
    }
}
