import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas serão registradas? ");
        int numNotas = ler.nextInt();

        while (numNotas > 50) {
            System.out.println("Valor inválido! Deve ser igual ou menor que 50. Tente novamente: ");
            numNotas = ler.nextInt();
        }

        double[] vetor = new double[numNotas];

        System.out.println("Digite as notas dos alunos: ");
        for (int i = 1; i <= numNotas; i++) {
        System.out.print(String.format("Aluno %d: ", i));
        vetor[i - 1] = ler.nextDouble();
        }
        ler.close();

        System.out.print(String.format("A média das notas dos alunos é: %.2f", Calculo.mediaAlunos(vetor)));
    }
}
