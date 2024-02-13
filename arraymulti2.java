/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza

1 2 3
4 5 6
Matrice risultato

 1 4
 2 5
 3 6 */
public class arraymulti2 {
    public static void main (String [] args) {
        int [][] matrix = creaMatrice (3, 5);
        scambio(matrix, 3, 5);

    }
    public static int [][] creaMatrice (int nRaws, int nCol) {
        int [][] matrix = new int [nRaws] [nCol];
        int k = 1;
        for (int j = 0; j < nRaws; j++) {
            for (int i = 0; i < nCol; i++) {
                matrix[j][i] = k;
                System.out.print(matrix[j][i]);
                k++;
            }
            System.out.print("\n");
        }
        return(matrix);
    }
    public static int [][] scambio (int [][] matrix, int nRaws, int nCol) {
        int [][] newMatrix = new int [nCol] [nRaws];
        for (int j = 0; j < nCol; j++) {
            for (int i = 0; i < nRaws; i++) {
                newMatrix[j][i] = matrix [i][j];
                System.out.print(newMatrix[j][i]);
            }
            System.out.print("\n");
        }
        return (newMatrix);
    }
}