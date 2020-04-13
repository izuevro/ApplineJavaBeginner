import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/romanzuev/Desktop/test.txt"))) {
            String line;
            int count = 0;
            System.out.println("Содержимое файла:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                count++;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/romanzuev/Desktop/test.txt"));
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите " + count + " новых строк для записи в файл:");
            for (int i = 0; i < count; i++) {
                writer.write(rd.readLine() + "\n");
            }
            System.out.println("Данные записаны!");
            writer.close();
            rd.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}