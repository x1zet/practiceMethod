import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int number = inputNumber();
        System.out.println(evenOrOdd(number));
    }

    public static int inputNumber(){
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public static String evenOrOdd(int firstNumber){
        String evenOrOdd = "";
        evenOrOdd =  firstNumber % 2 == 0 ? evenOrOdd = "Четное" : "Нечетное";
        return evenOrOdd;
    }
}
