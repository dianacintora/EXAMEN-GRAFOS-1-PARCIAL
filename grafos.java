public class grafos{
    public static void imprimirGrafo(int[][] grafo) {
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo[i].length; j++) {
                System.out.print(grafo[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] grafo1 = new int [5][5];
        int[][] grafo2 = new int [6][6];
        int[][] grafo3 = new int [6][6];
        int[][] grafo4 = new int [5][5];
        int[][] grafo5 = new int [6][6];

        grafo1[0][1] = 1;
        grafo1[0][2] = 2;
        grafo1[0][3] = 3;
        grafo1[0][4] = 4;
        grafo1[1][0] = 1;
        grafo1[2][0] = 2;
        grafo1[3][0] = 3;
        grafo1[4][0] = 4;

        grafo1[1][1] = 0;
        grafo1[1][2] = 1;
        grafo1[1][3] = 1;
        grafo1[1][4] = 0;

        grafo1[2][1] = 1;
        grafo1[2][2] = 0;
        grafo1[2][3] = 1;
        grafo1[2][4] = 1;

        grafo1[3][1] = 1;
        grafo1[3][2] = 1;
        grafo1[3][3] = 0;
        grafo1[3][4] = 1;

        grafo1[4][1] = 0;
        grafo1[4][2] = 1;
        grafo1[4][3] = 1;
        grafo1[4][4] = 0;

        //Grafo2

        grafo2[0][1] = 1;
        grafo2[0][2] = 2;
        grafo2[0][3] = 3;
        grafo2[0][4] = 4;
        grafo2[0][5] = 5;
        grafo2[1][0] = 1;
        grafo2[2][0] = 2;
        grafo2[3][0] = 3;
        grafo2[4][0] = 4;
        grafo2[5][0] = 5;

        grafo2[1][1] = 1;
        grafo2[1][2] = 1;
        grafo2[1][3] = 0;
        grafo2[1][4] = 0;
        grafo2[1][5] = 0;

        grafo2[2][1] = 1;
        grafo2[2][2] = 0;
        grafo2[2][3] = 1;
        grafo2[2][4] = 0;
        grafo2[2][5] = 0;

        grafo2[3][1] = 0;
        grafo2[3][2] = 1;
        grafo2[3][3] = 0;
        grafo2[3][4] = 1;
        grafo2[3][5] = 0;

        grafo2[4][1] = 0;
        grafo2[4][2] = 0;
        grafo2[4][3] = 1;
        grafo2[4][4] = 0;
        grafo2[4][5] = 1;

        grafo2[5][1] = 0;
        grafo2[5][2] = 0;
        grafo2[5][3] = 0;
        grafo2[5][4] = 1;
        grafo2[5][5] = 0;

        //Grafo3

        grafo3[0][1] = 1;
        grafo3[0][2] = 2;
        grafo3[0][3] = 3;
        grafo3[0][4] = 4;
        grafo3[0][5] = 5;
        grafo3[1][0] = 1;
        grafo3[2][0] = 2;
        grafo3[3][0] = 3;
        grafo3[4][0] = 4;
        grafo3[5][0] = 5;

        grafo3[1][1] = 0;
        grafo3[1][2] = 1;
        grafo3[1][3] = 1;
        grafo3[1][4] = 1;
        grafo3[1][5] = 0;

        grafo3[2][1] = 1;
        grafo3[2][2] = 0;
        grafo3[2][3] = 1;
        grafo3[2][4] = 0;
        grafo3[2][5] = 1;

        grafo3[3][1] = 1;
        grafo3[3][2] = 1;
        grafo3[3][3] = 0;
        grafo3[3][4] = 1;
        grafo3[3][5] = 1;

        grafo3[4][1] = 1;
        grafo3[4][2] = 0;
        grafo3[4][3] = 1;
        grafo3[4][4] = 1;
        grafo3[4][5] = 0;

        grafo3[5][1] = 0;
        grafo3[5][2] = 1;
        grafo3[5][3] = 1;
        grafo3[5][4] = 0;
        grafo3[5][5] = 0;

        //Grafo4

        grafo4[0][1] = 1;
        grafo4[0][2] = 2;
        grafo4[0][3] = 3;
        grafo4[0][4] = 4;
        grafo4[1][0] = 1;
        grafo4[2][0] = 2;
        grafo4[3][0] = 3;
        grafo4[4][0] = 4;

        grafo4[1][1] = 0;
        grafo4[1][2] = 1;
        grafo4[1][3] = 1;
        grafo4[1][4] = 1;

        grafo4[2][1] = 1;
        grafo4[2][2] = 0;
        grafo4[2][3] = 1;
        grafo4[2][4] = 1;

        grafo4[3][1] = 1;
        grafo4[3][2] = 1;
        grafo4[3][3] = 0;
        grafo4[3][4] = 0;

        grafo4[4][1] = 1;
        grafo4[4][2] = 1;
        grafo4[4][3] = 0;
        grafo4[4][4] = 0;

        //Grafo5

        grafo5[0][1] = 1;
        grafo5[0][2] = 2;
        grafo5[0][3] = 3;
        grafo5[0][4] = 4;
        grafo5[0][5] = 5;
        grafo5[1][0] = 1;
        grafo5[2][0] = 2;
        grafo5[3][0] = 3;
        grafo5[4][0] = 4;
        grafo5[5][0] = 5;

        grafo5[1][1] = 1;
        grafo5[1][2] = 1;
        grafo5[1][3] = 1;
        grafo5[1][4] = 0;
        grafo5[1][5] = 0;

        grafo5[2][1] = 1;
        grafo5[2][2] = 0;
        grafo5[2][3] = 1;
        grafo5[2][4] = 1;
        grafo5[2][5] = 1;

        grafo5[3][1] = 1;
        grafo5[3][2] = 1;
        grafo5[3][3] = 0;
        grafo5[3][4] = 1;
        grafo5[3][5] = 0;

        grafo5[4][1] = 0;
        grafo5[4][2] = 1;
        grafo5[4][3] = 1;
        grafo5[4][4] = 0;
        grafo5[4][5] = 1;

        grafo5[5][1] = 0;
        grafo5[5][2] = 1;
        grafo5[5][3] = 0;
        grafo5[5][4] = 1;
        grafo5[5][5] = 0;

        System.out.println("Grafo 1:");
        imprimirGrafo(grafo1);
        System.out.println("\nGrafo 2:");
        imprimirGrafo(grafo2);
        System.out.println("\nGrafo 3:");
        imprimirGrafo(grafo3);
        System.out.println("\nGrafo 4:");
        imprimirGrafo(grafo4);
        System.out.println("\nGrafo 5:");
        imprimirGrafo(grafo5);

    }
}