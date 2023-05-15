import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][8];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(String.format("\nLinha %d: ", i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(String.format("Valor %d: ", j + 1));
                matriz[i][j] = ler.nextInt();
            }
        }
        ler.close();

        Matriz.mostrarMatriz(matriz);
    }
}
