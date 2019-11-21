import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lengh of rectangle sides: ");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        String sb = reader.readLine();
        int b = Integer.parseInt(sb);
        System.out.println("Area of rectangle = " + (a * b));
        System.out.println("Perimeter of rectangle = " + (a + b));
    }
}
