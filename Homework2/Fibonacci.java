import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter X number of Fibonacci: ");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        long next = 1;
        long prev = 0;
        int counter = 0;
        while( counter < a )
        {
            System.out.print(prev + "  ");
            long sum = next + prev;
            next = prev;
            prev = sum;
            counter++;
        }
    }
}
