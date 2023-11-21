package Atividade3Pontos;

class ArrayNumeroInteiro {
    private int[] array;
    private int numeroAtual;
    private int numeroMaximo;

    public ArrayNumeroInteiro(int tamanho) {
        this.array = new int[tamanho];
        this.numeroAtual = 0;
        this.numeroMaximo = tamanho;
    }

    public boolean adicionar(int n) {
        if (numeroAtual < numeroMaximo) {
            array[numeroAtual] = n;
            numeroAtual++;
            return true;
        } else {
            return false;
        }
    }

    public int calculaMedia() {
        if (numeroAtual == 0) {
            return 0;
        }

        int soma = 0;
        for (int i = 0; i < numeroAtual; i++) {
            soma += array[i];
        }

        return soma / numeroAtual;
    }
}
