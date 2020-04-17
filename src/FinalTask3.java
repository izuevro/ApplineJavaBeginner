import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FinalTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Введите курс доллара:");
        double rate = Double.parseDouble(reader.readLine());
        System.out.println("Введите кол-во рублей:");
        double money = Double.parseDouble(reader.readLine());
        String end = df.format(money / rate);
        System.out.println("Значение по курсу: " + end + "$");
    }
}