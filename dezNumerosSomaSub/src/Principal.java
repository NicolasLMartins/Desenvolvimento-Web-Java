import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
     
        System.out.println("Digite dez números: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(String.format("Número %d: ", i + 1));
            vetor[i] = ler.nextInt(); 
        }
        ler.close();

        System.out.println(String.format("Soma dos valores de posições pares: %d", Calculo.somaSub(vetor, true)));
        System.out.println(String.format("Subtração dos valores de posições ímpares: %d", Calculo.somaSub(vetor, false)));
    }
}
