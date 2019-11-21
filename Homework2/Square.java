import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter side length of square: ");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        System.out.println("Area of square = " + (a * a));
        System.out.println("Perimeter of square = " + ( a + a));
    }
}
