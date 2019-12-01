public class Homework1_1 {
    public static void main(String[] args){
        byte firstNumber = 0;
        short secondNumber = -1000;
        int third = 150000;
        double decimal = 36.6;

        String fNumber = firstNumber > 0 ? "firstNumber > 0" : firstNumber == 0 ? "firstNumber = 0" : "firstNumber < 0";
        System.out.println(fNumber);

        String sNumber = secondNumber > 0 ? "secondNumber > 0" : secondNumber == 0 ? "secondNumber = 0" : "secondNumber < 0";
        System.out.println(sNumber);

        String thNumber = third > 0 ? "thirdNumber > 0" : third == 0 ? "thirdNumber = 0" : "thirdNumber < 0";
        System.out.println(thNumber);

        String dc = decimal > 0 ? "decimal > 0" : decimal == 0 ? "decimal = 0" : "decimal < 0";
        System.out.println(dc);
    }
}
