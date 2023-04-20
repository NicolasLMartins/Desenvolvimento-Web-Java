import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        Scanner ler = new Scanner(System.in);

        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.println("Digite um número inteiro para o vetor: ");
            vetor[cont] = ler.nextInt();
        }
        ler.close();
        
        System.out.println("Maior número: " + Calculo.maiorNumero(vetor));
    }
}
