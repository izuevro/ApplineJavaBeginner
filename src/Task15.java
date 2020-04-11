import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива:");
        int length = Integer.parseInt(reader.readLine());
        int[] array = new int[length];
        System.out.println("Заполните массив элементами:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int x;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int y : array
        ) {
            System.out.print(y + "\t");
        }
    }
}
