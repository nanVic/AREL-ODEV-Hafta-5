public class MatrixSort {
    public static void main(String[] args) {
     
        int rows = 4; // satır 
        int cols = 5; // sütun 
        int[][] matrix = new int[rows][cols];

        //random değerler
        fillMatrixWithRandomValues(matrix, rows, cols);

        //sıralama öncesi
        System.out.println("Original Matrix:");
        printMatrix(matrix, rows, cols);

        //sıralama
        sortMatrix(matrix, rows, cols);

        //yazdırma sıralamadn sonrası
        System.out.println("Sorted Matrix:");
        printMatrix(matrix, rows, cols);
    }

    public static void fillMatrixWithRandomValues(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100); // 0-99 arası random değer
            }
        }
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortMatrix(int[][] matrix, int rows, int cols) {
        int size = rows * cols;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (matrix[j / cols][j % cols] > matrix[(j + 1) / cols][(j + 1) % cols]) {
                    //yer değiştirr
                    int temp = matrix[j / cols][j % cols];
                    matrix[j / cols][j % cols] = matrix[(j + 1) / cols][(j + 1) % cols];
                    matrix[(j + 1) / cols][(j + 1) % cols] = temp;
                }
            }
        }
    }
}
