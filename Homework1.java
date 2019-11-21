		int a = 20;
		a = ++a + ++a + ++a + a-- -6 = 83;
		a = 21 + 22 + 23 + 23 - 6 = 83;
		int a = 10;
		a = a++ + a + a-- + a-- + -- a + a++ - --a + a++ - a-- + a - --a + a++ + ++a = 66;
		a = 10 + 11 + 11 +  10  +    8 + 8   -   8 + 8   - 9  +  8 -   7 + 7   +  9 = 66;
		a = 10;
		a = a++ + a * a-- + a-- * -- a + a++ - --a * a++ - a-- + a - --a * a++ + ++a = 114;
		a = 10  + 11*11   + 10  *    8 + 8  -    8 * 8   - 9  + 8 - 7 * 7 + 9 = 
		    10  +   121    +     80    + 8   -     64    - 9  + 8 -   49  + 9 = 114;   



public class Homework1{
	public static void main(String[] args){
        byte firstNumber = 0;
        short secondNumber = -1000;
        int third = 150000;
        double decimal = 36.6;

        if (firstNumber > 0)
            System.out.println(firstNumber + " > 0");
        else if (firstNumber == 0)
            System.out.println(firstNumber + " = 0");
        else System.out.println(firstNumber + " < 0");

        if (secondNumber > 0)
            System.out.println(secondNumber + " > 0");
        else if (secondNumber == 0)
            System.out.println(secondNumber + " = 0");
        else System.out.println(secondNumber + " < 0");

        if (third > 0)
            System.out.println(third + " > 0");
        else if (third == 0)
            System.out.println(third + " = 0");
        else System.out.println(third + " < 0");

        if ( decimal > 0)
            System.out.println( decimal + " > 0");
        else if ( decimal == 0)
            System.out.println( decimal + " = 0");
        else System.out.println( decimal + " < 0");

    }
}