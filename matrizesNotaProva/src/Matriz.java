public class Matriz {
    static void mostrarMatriz(Float[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            
            System.out.print(String.format("Notas do aluno #%d: ", i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(String.format("Nota %d/4: |%-5.2f| ", j + 1, matriz[i][j]));
                // System.out.print(matriz[i][j]);
            }

            System.out.println();
        }
    }
}
