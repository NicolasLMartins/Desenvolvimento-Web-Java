public class Calculo {
    public static int maiorNumero(int[] vetor) {
        int maiorNumero = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
            }
        }

        return maiorNumero;
    }
}
