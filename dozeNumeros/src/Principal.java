import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[12];
        int[] vetPar = new int[12];
        int[] vetImpar = new int[12];
        int vetParCont = 0;
        int vetImparCont = 0;
        
        System.out.println("Digite doze números: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(String.format("Número %d: ", i + 1));
            vetor[i] = ler.nextInt();
            if (vetor[i] % 2 == 0) {
                vetPar[vetParCont] = vetor[i];
                vetParCont++;
            } else {
                vetImpar[vetImparCont] = vetor[i];
                vetImparCont++;
            }
        }
        ler.close();

        System.out.println(String.format("%nNúmeros pares: "));
        for (int i = 0; i < vetParCont; i++) {
            System.out.println(String.format("Número: %d", vetPar[i]));
        }

        System.out.println(String.format("%nNúmeros ímpares: "));
        for (int i = 0; i < vetImparCont; i++) {
            System.out.println(String.format("Número: %d", vetImpar[i]));
        }
    }
}