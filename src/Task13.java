import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую строку:");
        String first = reader.readLine();
        System.out.println("Введите вторую строку:");
        String second = reader.readLine();
        if (first.length() > second.length()) {
            System.out.println(first);
        } else if (first.length() < second.length()) {
            System.out.println(second);
        } else {
            System.out.println("Длины строк равны");
        }
    }
}