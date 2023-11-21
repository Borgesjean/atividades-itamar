package Atividade3Pontos;

public class questao3 {
            public static void main(String[] args) {
                int soma = 0;

                for (int i = 1; i <= 50; i++) {

                    if (i % 2 != 0) {
                        soma += i;
                    }
                }

                System.out.println("A soma dos números ímpares de 1 a 50 é: " + soma);
            }
        }