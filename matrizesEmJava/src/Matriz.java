public class Matriz {
    static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(String.format("|%-10d|", matriz[j][i]));
            }
            System.out.println();
        }
    }
    
    static int somaDiagPrin(int[][] matriz){
        int soma = 0;
        
        for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][i];
        }

        return soma;
    }
}
