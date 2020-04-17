import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в двоичной системе:");
        String num = reader.readLine();
        int finalNum = 0;
        int length = num.length();

        for (int i = 0; i < num.length(); i++) {
            char symNum = num.charAt(i);
            if ((int) symNum == 49) {
                int result = 1;
                for (int j = 1; j <= length - 1; j++) {
                    result *= 2;
                }
                finalNum += result;
            }
            length--;
        }
        System.out.println("Число в десятичной системе: " + finalNum);
    }
}
