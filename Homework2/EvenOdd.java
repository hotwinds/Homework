import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOdd {
    public stati void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two figures: ");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        String sb = reader.readLine();
        int b = Integer.parseInt(sb);
        System.out.print("Even: ");
        for(int i = 0; i <= a; i = i + 2) System.out.print(i + " ");
        System.out.print("\n");
        System.out.print("Odd: ");
        for(int j = 1; j <= b; j = j + 2) System.out.print(j + " ");
    }
}
