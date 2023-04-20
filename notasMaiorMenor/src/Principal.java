import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double[] vetor = new double[4];
        

        System.out.println("Digite as notas de quatro alunos: ");
        for (int i = 1; i <= vetor.length; i++) {
            System.out.print(String.format("Aluno %d: ", i));
            vetor[i - 1] = ler.nextDouble();
        }
        ler.close();

        System.out.println(String.format("Maior nota: %.2f", Calculo.maiorNota(vetor)));
        System.out.println(String.format("Menor nota: %.2f", Calculo.menorNota(vetor)));
    }
}