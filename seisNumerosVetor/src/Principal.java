import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[6];

        System.out.println("Digite seis números: ");
        for (int i = 1; i <= vetor.length; i++) {
            System.out.print(String.format("Número %d: ", i));
            vetor[i - 1] = ler.nextInt();
        }
        ler.close();

        System.out.println("Sequência invertida: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(String.format("Número %d: %d", (i + 1), vetor[i]));
        }
    }
}
