package Atividade3Pontos;
import java.util.Scanner;
public class questao9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[100];
            int quantidadeDeNumeros = 0;

            System.out.println("Digite os números (insira 0 para parar):");
            int numero;
            do {
                numero = scanner.nextInt();

                if (numero != 0) {
                    numeros[quantidadeDeNumeros] = numero;
                    quantidadeDeNumeros++;
                }

            } while (numero != 0);

            System.out.println("Quantidade de números lidos: " + quantidadeDeNumeros);

            scanner.close();
        }
        
    }
