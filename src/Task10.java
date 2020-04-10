import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы:");
        int lines = Integer.parseInt(reader.readLine());
        int length = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[lines][length];
        System.out.println("Заполните массив:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Элементы первого массива x3:");
        for (int x : matrix[0]
        ) {
            System.out.println(x * 3);
        }
    }
}

