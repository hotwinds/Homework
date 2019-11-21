import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Summ {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two figures: ");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        String sb = reader.readLine();
        int b = Integer.parseInt(sb);
        System.out.println("Summm of two figures = " + (a + b));
    }
}
