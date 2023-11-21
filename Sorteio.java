package Atividade3Pontos;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Sorteio sorteio = new Sorteio();
        sorteio.realizarSorteio();
    }

    private void realizarSorteio() {
        int numeroSorteado = (int) (Math.random() * 1001);

        Scanner scanner = new Scanner(System.in);
        int palpite;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de sorteio! Tente adivinhar o número entre 0 e 1000.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSorteado) {
                System.out.println("Seu palpite é menor. Tente novamente!");
            } else if (palpite > numeroSorteado) {
                System.out.println("Seu palpite é maior. Tente novamente!");
            }

            tentativas++;

        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");

        scanner.close();
    }
}
