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
                matriz[j][i] = ler.nextFloat();
            }
        }
        ler.close();
        
        // Matriz.mostrarMatriz(matriz);
        Matriz.mostrarMenorNota(matriz);
    }

    // public static void main(String[] args) {

    // int[][] exampleVariableOne = new int[10][5];
    // // returns the length of the rows in the array
    // int lengthOne = exampleVariableOne.length;
    // // returns the length of the columns in the array
    // int lengthTwo = exampleVariableOne[0].length;
  
    //   System.out.println(lengthOne);
    //   System.out.println(lengthTwo);

    //   for (int i = 0; i < lengthTwo; i++) {
    //     for (int j = 0; j < lengthOne; j++) {
    //       System.out.print("|\\\\|");
    //     }
    //     System.out.println();
    //   }
    // }
}