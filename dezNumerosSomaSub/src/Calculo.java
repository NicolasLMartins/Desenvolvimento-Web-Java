public class Calculo {
    public static int somaSub(int[] vetor, boolean isEven) {
        int vetParSoma = 0;
        int vetImparSub = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetParSoma += vetor[i];
            }
            else{
                vetImparSub -= vetor[i];
            }
        }

        if (isEven == true) {
            return vetParSoma;
        }
        else{
            return vetImparSub;
        }
    }
}
