public class matrizes {

    public static void main(String[] args) {

        int[][] numeros = new int[3][3];
        numeros[0][0] = 3;
        numeros[0][1] = 6;
        numeros[0][2] = 9;
        numeros [1][0] = 12;
        numeros [1][1] = 15;
        numeros [1][2] = 18;
        numeros [2][0] = 21;
        numeros [2][1] = 24;
        numeros [2][2] = 27;

        for (int i = 0; 1 < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            
            System.out.println();
        }

    }
    
}
