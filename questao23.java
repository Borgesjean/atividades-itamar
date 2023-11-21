package Atividade3Pontos;
import java.util.ArrayList;
import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes (insira 'FIM' para parar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equals("FIM")) {
                break;
            }

            nomes.add(nome);
        }

        System.out.println("\nNomes em ordem inversa:");

        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }

        scanner.close();
    }
}
