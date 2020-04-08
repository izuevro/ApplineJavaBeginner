import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в бинарном формате:");
        String value = reader.readLine();
        int newValue = Integer.parseInt(value,2);
        System.out.println("Число в десятичном формате:" + "\n" + newValue);
    }
}
