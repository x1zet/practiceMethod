import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        double number = inputNumber();
        System.out.println("Число в квадрате: " + squareNumber(number));
    }

    public static int inputNumber(){
        System.out.println("Введите число для вознесения в квадрат: ");
        return new Scanner(System.in).nextInt();
    }

    public static double squareNumber(double number){
        return number * number;
    }
}
