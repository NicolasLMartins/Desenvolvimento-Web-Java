public class Matriz {

    static void mostrarMenorNota(Float[][] matriz){
        Float menor = matriz[0][0];
        int indice = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            menor = matriz[0][i];
            
            System.out.print(String.format("Menor nota do aluno #%d: ", i + 1));
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] <= menor) {
                    menor = matriz[j][i];
                    indice = j;
                }
            }

            System.out.print(String.format("Nota %d/3: |%-5.2f| ", indice + 1, menor));
            System.out.println();
        }
    }

    // static void mostrarMatriz(Float[][] matriz){
    //     for (int i = 0; i < matriz[0].length; i++) {
    //         for (int j = 0; j < matriz.length; j++) {
    //             System.out.print(String.format("%d|%-10.2f|", j + 1, matriz[j][i]));
    //         }
    //         System.out.println();
    //     }
    // }
}
