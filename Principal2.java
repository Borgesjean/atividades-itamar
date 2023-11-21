package Atividade3Pontos;
import java.util.Scanner;

public class Principal2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o tamanho do array (N): ");
            int tamanhoArray = scanner.nextInt();

            ArrayNumeroInteiro arrayInteiro = new ArrayNumeroInteiro(tamanhoArray);

            for (int i = 0; i < tamanhoArray; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                arrayInteiro.adicionar(numero);
            }

            int media = arrayInteiro.calculaMedia();
            System.out.println("A média aritmética dos números é: " + media);

            scanner.close();
        }
    }

