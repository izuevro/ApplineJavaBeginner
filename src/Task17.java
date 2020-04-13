import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Вводите значения в консоль. Для остановки введите слово stop");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/romanzuev/Desktop/test.txt"));
            String line;
            while (!(line = reader.readLine()).equals("stop")) {
                writer.write(line);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
