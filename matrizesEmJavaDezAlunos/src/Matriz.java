public class Matriz {

    static void mostrarMenorNota(Float[][] matriz){
        Float menor = matriz[0][0];
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    System.out.print(menor);
                }
            }
        }
    }
}
