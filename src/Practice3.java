import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        double number = inputNumber();
        System.out.println("Число в кубе: " + cubeNumber(number));
    }

    public static int inputNumber(){
        System.out.println("Введите число для вознесения в куб: ");
        return new Scanner(System.in).nextInt();
    }

    public static double cubeNumber(double number){
        return number * number * number;
    }
}
