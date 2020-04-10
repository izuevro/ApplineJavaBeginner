import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива:");
        int length = Integer.parseInt(reader.readLine());
        int[] array = new int[length];
        System.out.println("Заполните массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Элементы массива x2:");
        for (int x : array
        ) {
            System.out.println(x * 2);
        }
    }
}
