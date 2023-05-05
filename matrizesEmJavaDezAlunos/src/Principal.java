import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Float[][] matriz = new Float[3][4];
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite as notas dos alunos: ");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println(String.format("\nAluno %d: ", i + 1));
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(String.format("Nota %d/3: ", j + 1));
                matriz[i][j] = ler.nextFloat();
            }
        }
        ler.close();
        
        Matriz.mostrarMenorNota(matriz);
    }
}