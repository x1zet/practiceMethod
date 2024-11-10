import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int number = inputNumber();
        int degree = inputDegree();

        System.out.println("Число в степени: "+elevate(number,degree));
    }

    public static int inputNumber(){
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public static int inputDegree(){
        System.out.println("Введите степень: ");
        return new Scanner(System.in).nextInt();
    }

    public static int elevate(int number, int degree){
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }

        return result;
    }
}
