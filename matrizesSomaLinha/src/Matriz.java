public class Matriz {
    static void mostrarMatriz(int[][] matriz){
        // int[] somalinha = new int[matriz.length];        

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;        

            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
            // somalinha[i] = soma;
            
            System.out.print(String.format("Soma da linha %d: |%5d|", i + 1, soma /*somalinha[i] */));

        System.out.println();
        }
    }
}
