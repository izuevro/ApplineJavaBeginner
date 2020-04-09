import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа:");
        int value1 = Integer.parseInt(reader.readLine());
        int value2 = Integer.parseInt(reader.readLine());
        int value3 = Integer.parseInt(reader.readLine());
        double avg = (double) (value1 + value2 + value3) / 3;
        int result = (int) (avg) / 2;
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}