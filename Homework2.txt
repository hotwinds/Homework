1. Приложение, которое может спросить пользователя ввести 2 числа и вывести их на экран.
public class Figures {
	public stati void main(String[] args) throws Exception{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two figures: ");
	String sa = reader.readLine();
	int a = Integer.parseInt(sa);
	String sb = reader.readLine();
	int b = Integer.parseInt(sb);
	System.out.println("a = " + a + " " + "b = " + b);
	}
}

2. Приложение, которое может определить, является ли буква X гласной или согласной.
public class VowelConsonant {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter symbol: ");
        char c = (char)reader.read();
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }
    }
}
3. Приложение, которое вычисляет сумму чисел X и Y.
public class Summ {
public stati void main(String[] args) throws Exception{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two figures: ");
	String sa = reader.readLine();
	int a = Integer.parseInt(sa);
	String sb = reader.readLine();
	int b = Integer.parseInt(sb);
	System.out.println("Summm of two figures = " + (a + b));
	}
}

4. Приложение, которое вычисляет периметр и площадь квадрата со стороной X, прямоугольника со сторонами X, Y.
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

public class Rectangle{
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

5. Приложение, способное отображать первые X четные цифры и первые Y нечетные< начиная с нуля. Пример: первые 2 четных числа - 0, 2; нечетных - 1, 3
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

6. Создайте приложение, способное генерировать X чисел Фибоначчи.
public class Fibonacci{
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