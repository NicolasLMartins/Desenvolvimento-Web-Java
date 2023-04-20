public class Calculo {
    public static double mediaAlunos(double[] vetor) {
        double soma = 0.0;
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]; 
        }
        
        return (soma / vetor.length);
    }
}
