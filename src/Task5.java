import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 10:");
        int value = Integer.parseInt(reader.readLine());
        System.out.println("Таблица умножения для числа " + value + ":");
        System.out.println(value + " x 1 = " + value);
        System.out.println(value + " x 2 = " + value * 2);
        System.out.println(value + " x 3 = " + value * 3);
        System.out.println(value + " x 4 = " + value * 4);
        System.out.println(value + " x 5 = " + value * 5);
        System.out.println(value + " x 6 = " + value * 6);
        System.out.println(value + " x 7 = " + value * 7);
        System.out.println(value + " x 8 = " + value * 8);
        System.out.println(value + " x 9 = " + value * 9);
        System.out.println(value + " x 10 = " + value * 10);
    }
}
