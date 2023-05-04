import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(String.format("Coordenada (%d, %d): ", i, j));
                matriz[i][j] = ler.nextInt();
            }
        }
        ler.close();

        System.out.println(String.format("\nSoma da diagonal principal: %d", Matriz.somaDiagPrin(matriz)));
        System.out.println("\nMatriz: ");
        Matriz.mostrarMatriz(matriz);
    }
}
