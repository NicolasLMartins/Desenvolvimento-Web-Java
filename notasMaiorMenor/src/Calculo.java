public class Calculo {
    public static double maiorNota(double[] vetor) {
        double maior = vetor [0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        
        return maior;
    }

    public static double menorNota(double[] vetor) {
        double menor = vetor [0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }
}
