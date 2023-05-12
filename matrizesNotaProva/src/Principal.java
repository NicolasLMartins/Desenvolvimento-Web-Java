import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Float[][] matriz = new Float[5][4];

        System.out.println("Digite as notas dos alunos: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(String.format("Aluno %d: ", i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(String.format("Nota %d: ", j + 1));
                matriz[i][j] = ler.nextFloat();
                // matriz[i][j] = "|t|";
            }
        }
        ler.close();

        Matriz.mostrarMatriz(matriz);
    }
}
