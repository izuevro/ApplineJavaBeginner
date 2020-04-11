import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        String text = reader.readLine();
        String newText = text.replaceAll(" ", "");
        System.out.println(newText);
    }
}