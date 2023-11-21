package Atividade3Pontos;
import java.util.Scanner;

public class questao44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        System.out.print("Digite o valor de J: ");
        int valorJ = scanner.nextInt();

        String mensagemCriptografada = criptografarCesar(mensagem, valorJ);

        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

        scanner.close();
    }

    private static String criptografarCesar(String mensagem, int valorJ) {
        StringBuilder mensagemCriptografada = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);

            if (caractere >= 'a' && caractere <= 'z') {
                mensagemCriptografada.append((char) ((caractere - 'a' + valorJ) % 26 + 'a'));
            } else if (caractere >= 'A' && caractere <= 'Z') {
                mensagemCriptografada.append((char) ((caractere - 'A' + valorJ) % 26 + 'A'));
            } else {
                mensagemCriptografada.append(caractere);
            }
        }

        return mensagemCriptografada.toString();
    }
}
