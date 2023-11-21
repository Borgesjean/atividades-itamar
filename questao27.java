package Atividade3Pontos;

public class questao27 {
    public static void main(String[] args) {
        double media1 = calcularMedia(8, 9, 7);
        System.out.println("Média dos números 8, 9 e 7: " + media1);

        double media2 = calcularMedia(4, 5, 6);
        System.out.println("Média dos números 4, 5 e 6: " + media2);

        double somaDasMedias = media1 + media2;
        System.out.println("Soma das duas médias: " + somaDasMedias);

        double mediaDasMedias = calcularMedia(media1, media2);
        System.out.println("Média das médias: " + mediaDasMedias);
    }

    private static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    private static double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2;
    }
}
