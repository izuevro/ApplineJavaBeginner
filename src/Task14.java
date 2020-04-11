import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        String S = reader.readLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}