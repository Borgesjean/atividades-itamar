package Atividade3Pontos;
import java.util.Scanner;
public class questao4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int maiorNumero = Integer.MIN_VALUE;

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }

            System.out.println("O maior número é: " + maiorNumero);

            scanner.close();
        }
    }


