import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber = inputNumber();
        int secondNumber = inputNumber();

        System.out.println("Меньшее число: " + minNumber(firstNumber,secondNumber));
    }

    public static int minNumber(int firstNumber, int secondNumber){
        return Math.min(firstNumber, secondNumber);
    }

    public static int inputNumber(){
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}